
public class HalfNumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		 1 
//		 1  2 
//		 1  2  3 
//		 1  2  3  4 
//		 1  2  3  4  5 
		
		
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}

	}

}
