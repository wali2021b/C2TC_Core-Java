
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234,temp;
temp=num;
System.out.println("Reverse of the Number "+num+" is");
while(temp>=1)
{
	System.out.print(temp%10);
	temp/=10;
}
	}

}
