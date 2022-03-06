
public class invertedHalfnump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 111*
// 11**
// 1***
// ****

		int i,n=4;
		for(i=1;i<=4;i++)
		{
			for(int j=1;j<=n-i;j++) {
				System.out.print(" 1 ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

}
