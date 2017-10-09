package concept;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= {{1,2,4},{3,6,2},{7,1,5}};
	
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.println("i="+i+"| j="+j);
//				a[i][j]=i+j;
//			}
//		}
		System.out.println("Multi Dimension array is of size = X axis :"+a.length+ "| Y axis :"+a[0].length);
		for (int i = 0; i<a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
