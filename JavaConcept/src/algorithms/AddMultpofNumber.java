package algorithms;

public class AddMultpofNumber {
//Find the sum of all the multiples of 3 or 5 below 1000.
	
	public static void main(String[] args) {

		//Dumb method
		int sum=0;
		for (int i = 1; i <1000; i++) {
			if(i%3==0 || i%5==0){
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		//Optimal Method
		int sum2=0;
		int occuranceof3=999/3;
		int sumofall3s=(3*(occuranceof3*(occuranceof3+1)))/2;
		int occuranceof5=999/5;
		int sumofall5s=(5*(occuranceof5*(occuranceof5+1)))/2;
		int occuranceof15=999/15;
		int sumofall15s=(15*(occuranceof15*(occuranceof15+1)))/2;
		System.out.println(sumofall3s+sumofall5s-sumofall15s);
	}

}
