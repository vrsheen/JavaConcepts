package algorithms;

public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={14,22,23,28,31,38,5,6,8,10,12};
		System.out.println("Number of rotated array = "+ findRotationCount(a));
	}
	
	public static int findRotationCount(int a[]){
		int n=a.length;
		int min=0,max=n-1,mid=0,next=0,prev=0;
		while(min<=max){
	System.out.println("["+mid+"] - "+min+" - "+max);
	System.out.println("[prev] - "+prev+" ||next - "+next);
			if(a[min]<=a[max]) return min;
			mid=(min+max)/2;next=(mid+1)%n;prev=(mid+n-1)%n;
			if(a[mid]<=a[next] && a[mid]<=a[prev]) return mid;
			else if (a[mid]<=a[max]) max=mid-1;
			else if (a[mid]>=a[min]) min=mid+1;
		}
		return -1;
	}

}
