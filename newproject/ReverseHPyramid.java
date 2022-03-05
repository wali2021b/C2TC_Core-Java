
public class ReverseHPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n = 7;
//		changing in inner loop only
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	
 
//		changes in outer Loop Only.
		
//		for (i = n; i >= 1; i--) {
//			for (j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
