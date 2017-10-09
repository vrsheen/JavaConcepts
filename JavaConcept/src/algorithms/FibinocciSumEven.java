package algorithms;

public class FibinocciSumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nextnum=1,prevNum=1,tempnextnum=0,evenSum=0;
		System.out.println(nextnum);
		while(nextnum<=4000000){
			tempnextnum=nextnum;
			nextnum=prevNum+nextnum;
			prevNum=tempnextnum;
			System.out.println(nextnum);
			if(nextnum%2==0){
				evenSum=evenSum+nextnum;
			}
		}
		System.out.println("Fibinocci Even sum="+evenSum);
		
		int f=26;
		int n=3;
		f /=n;
		System.out.println(f);
	}

}
