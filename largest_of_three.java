package large;

public class largest_of_three {
public static void main(String[]args) {
	int a, b, c, d,large;
	a=10;
	b=20;
	c=30;
	d=40;
	large=(a>b && a>c && a>d)? a:(b>c && b>d)? b:(c>d)? c:d;
	System.out.println("The largest of "+a+" ,"+b+","+c+" and "+d+" is= "+large);
}
}
