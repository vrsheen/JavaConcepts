package algorithms;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getFibonacciSeries(9,5);
		System.out.println(getFibonacciSumOf(9));
	}
//0 1 1 2 3 5 8 13 21 34
	
	public static void getFibonacciSeries(int num,int pos){
		int fibtot=0,fibloop=2;
		int fib1=0,fib2=1;
		while(fibloop<=num){
			fibloop++;
			fibtot=fib1+fib2;
			fib1=fib2;
			fib2=fibtot;
			if(pos==fibloop){
				System.out.println(fibtot);
				break;
			}
			System.out.print(fibtot+",");
		}
		System.out.println(fibtot);
	}
	
	public static long getFibonacciSumOf(long n) {
        if (n== 0 || n==1) {
            return n;
        } else {
            return getFibonacciSumOf(n-2) + getFibonacciSumOf(n-1);
        }
    }
}
