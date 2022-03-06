
public class halfInvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//         * 
//      *  * 
//   *  *  * 
//*  *  *  * 


		int i,n=4;
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>n-i)
			
					System.out.print(" * ");
				else
				System.out.print( "   ");
	
			}
			System.out.println();
			}
	}

}
