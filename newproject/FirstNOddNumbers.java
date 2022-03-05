import java.util.*;
public class FirstNOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Practice is the Mother of Learning....
		
		
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many odd Terms??");
		int num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			
			System.out.print(2*i-1+" ");
			sum=sum+(2*i-1);
		}
		System.out.println("\nAnd Sum of These Terms is... ="+sum );

	}

}
