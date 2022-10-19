package large;

public class Largest_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,large;
a=10;
b=20;
c=30;
large=(a>b && b>c)?a:(b>c)?b:c;
System.out.println("The largest of a:"+a+" , b:"+b+" and c:"+c+" is:"+large);
	}

}
