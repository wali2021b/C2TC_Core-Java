package newproject;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		a number which is only divisible by 1 and itself is prime number 1 is not a prime number.

		int num = 1010, i, count = 0;
		for (i = 1; i <= num; i++) 
		{
			if (num % i == 0)
			{
				count++;
			System.out.println("demo...");
			}
			if(count==3)
				break;

		}
		if(count==2)
			System.out.println(num+ " is a prime Number..");
		else
			System.out.println(num+ " is Not  a prime Number..");
	}
	

}
