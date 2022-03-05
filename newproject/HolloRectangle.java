
public class HolloRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j, n=4,m=5;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=m;j++) {
				if(i==1||j==1||j==m ||i==n)
				System.out.print(" * ");
				else
		System.out.print("   ");
		}
			System.out.println();
	}

}
}
