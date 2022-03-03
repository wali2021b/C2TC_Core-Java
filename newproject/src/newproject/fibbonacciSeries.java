package newproject;

public class fibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,num=15,n1=0,n2=1,sr;
System.out.print(n1+ " " + n2);
for(i=2;i<num;i++)
{
	n1+=(n1+n2)-(n2=n1);
//	System.out.println("n1="+n1 + "n2="+n2  );
	sr=n1+n2;
	System.out.print(" " +sr);
	
}
	}

}
