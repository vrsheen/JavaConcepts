package algorithms;

public class BinarySearch {

	static int datalength=0,mid=0,min=0,max=0;
	public static void main(String[] args) {
		
		int[] data={2,4,10,11,12,13,14,14,14,17,18,20,21,22,23,24,25,26};
		System.out.println(Binarysearch(data,14));
		System.out.println(Binarysearchfirstappr(data,14));
		System.out.println(BinarysearchOccurance(data,14));
	}
	public static String Binarysearch(int[] data,int searchint){
		datalength=data.length;
		min=0;
		max=datalength-1;
		
		while (min<=max){
			mid=(min+max)/2;
			System.out.println("["+mid+"] - "+min+" - "+max);
			if(data[mid]==searchint){
				return "integer found at position= "+mid;
			}else if(searchint>data[mid])min=mid+1;
			else if(searchint<data[mid]) max=mid-1;
		}
		return "Integer not found";
	}
	
public static String Binarysearchfirstappr(int[] data,int searchint){
	datalength=data.length;
	min=0;
	max=datalength-1;
	int lowest=-1;
	while (min<=max){
		mid=(min+max)/2;
		System.out.println("["+mid+"] - "+min+" - "+max);
		if(data[mid]==searchint){
			//Set the max to mid-1 so that the loop with check til the previous digit to see if there is any occurance
			lowest=mid;max=mid-1;
		}else if(searchint>data[mid])min=mid+1;
		else if(searchint<data[mid]) max=mid-1;
	}
	return  "integer found at position= "+lowest;
}

public static String BinarysearchOccurance(int[] data,int searchint){
	datalength=data.length;
	min=0;
	max=datalength-1;
	int lowest=0,cnt=0;

	while (min<=max){
		mid=(min+max)/2;
		System.out.println("["+mid+"] - "+min+" - "+max);
		if(data[mid]==searchint){
			lowest=mid;
			while(lowest-1>=0 && data[lowest-1]==searchint){
				lowest--;
				cnt++;
				System.out.println("Duplicate Integer found");
			}
			return "Integer "+searchint+" found at position= "+lowest+ " with "+cnt+" occurances";
		}else if(searchint>data[mid])min=mid+1;
		else if(searchint<data[mid]) max=mid-1;
	}
	return "Integer not found";
}
}
