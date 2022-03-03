package newproject;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// palindrom is a number whose reverse is same as the number itself.. like 141,757,5225 etc.
		
		
		int num=759,mm=0,sample;
		sample=num;
		while(num>1)
		{
			mm=num%10+mm*10;
			num/=10;
		}
		 if(sample==mm)
			 System.out.println(sample +" is a palindrom number.");
		 else
			 System.out.println(sample +" is Not a palindrom number.");
		
	}

}
