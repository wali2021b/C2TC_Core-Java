package newproject;

public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Armstrong Number is a number whose  sum of the cube of indivitual number is the number itself. eg.   153 (1^3 + 5^3+ 3^3 =153)
		int i, num = 1544, p, emp = 0, sample;
		sample = num;

		while (num >= 1) {
			p = num % 10;
			num /= 10;
			emp = emp + (p * p * p);
		}
		if (emp == sample)
			System.out.println(sample + " is an armstrong Number..");
		else
			System.out.println(sample + " is Not an armstrong Number..");


	}

}
