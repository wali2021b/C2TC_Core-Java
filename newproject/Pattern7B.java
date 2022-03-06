
public class Pattern7B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		 1  2  3  4  5 
//		 2  3  4  5 
//		 3  4  5 
//		 4  5 
//		 5 


		int i,j,n=5;
		for(i=0;i<n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" "+(i+j)+" ");
			}
			System.out.println();
		}
	}

}
