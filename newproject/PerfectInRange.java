import java.util.Scanner;

public class PerfectInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i,num,sum=0;
		
System.out.println("Enter a range to find perfect Numbers..");
Scanner sc=new Scanner(System.in);

int r1 = sc.nextInt();
int r2 = sc.nextInt();
while(r1<=r2)
{
//	System.out.println(r1+"inside the while"+sum);
	
for(i=1;i<r1;i++)
{
	if(r1%i==0)
		sum=sum+i;
}
if(r1==sum)
	System.out.println(r1+ " ");
sum=0;
r1++;
	}
	}

}
