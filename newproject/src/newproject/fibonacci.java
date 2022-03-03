package newproject;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,num=10,a=0,b=1,c;

for(i=0;i<num;i++) {
	System.out.print(a +" ");
	c=a+b;
	a=b;
	b=c;
}
	}

}
