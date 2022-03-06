
public class pattern7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 1  2  3  4  5 
//		 1  2  3  4 
//		 1  2  3 
//		 1  2 
//		 1 

		int i,j,n=5;
		for(i=0;i<n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}

	}

}
