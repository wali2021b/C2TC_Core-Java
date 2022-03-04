import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
//		perfect number is a number whose sum of are equl to the number ..    e.g 6(1+2+3)
		
		int i,num,sum=0;
		
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);

num=sc.nextInt();
for(i=1;i<num;i++)
{
	if(num%i==0)
		sum=sum+i;
}
if(sum==num)
	System.out.println( num +" is a perfect number..");
else
	System.out.println( num +" is not a perfect number..");
	}

}
