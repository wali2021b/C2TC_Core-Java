import java.util.Scanner;

public class NaturalNumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,sum=0;
Scanner wali=new Scanner(System.in);
System.out.println("Enter a Range to print Natural Numbers..");
int r1=wali.nextInt();
int r2=wali.nextInt();
for(i=r1;i<=r2;i++)
{
	System.out.print(i+" ");
	sum=sum+i;
}
System.out.println("\n And Sum of these Terms is ="+sum);
	}

}
