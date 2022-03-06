package jjjjj0001;

public class pattern08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
		
System.out.println("First Way ... Direct Declaration..");
for(int k=1, i=1;i<=5;i++)
{
//   	i%2==0?k=0:k=1;
	for(int j=1;j<=i;j++,k++)
	{
		System.out.print(" "+k);
	}
	System.out.println();
}
System.out.println("Second way....  out side variable...");
int count=1,i,j;

for(i=1;i<=5;i++)
{
	for(j=1;j<=i;j++)
	{
		System.out.print(count++ +" ");
	}
	System.out.println();
}
	}

}
