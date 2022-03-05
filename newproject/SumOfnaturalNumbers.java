import java.util.Scanner;

public class SumOfnaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit to count sum.");
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
sum=sum+i;
		}
		System.out.println(sum);
	}

}
