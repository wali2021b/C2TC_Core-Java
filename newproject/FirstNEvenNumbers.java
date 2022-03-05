import java.util.Scanner;

public class FirstNEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
Scanner sc=new Scanner(System.in);
System.out.println("How many terms ?");
int num=sc.nextInt();
// using Conditional statement...
//for(i=1;i<=num*2;i++)
//{
//	if(i%2==0)
//	System.out.println(i);
//}

//simple calculation without if()..
for(i=1;i<=num;i++)
{
	System.out.print(" "+2*i);
}
	}

}
