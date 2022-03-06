
public class invertedHpyrUsinIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 1  1  1  * 
//		 1  1  *  * 
//		 1  *  *  * 
//		 *  *  *  * 
//print it using conditional cluase..
		
		int i,n=4;
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>n-i)
			
					System.out.print(" * ");
				else
				System.out.print( " 1 ");
	
			}
			System.out.println();
			}
		}

}
