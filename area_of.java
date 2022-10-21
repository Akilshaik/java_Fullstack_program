package area;
import java.util.Scanner;
public class area_of {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the redius of circle");
radius = sc.nextInt();
area = (radius*radius)*Math.PI;
System.out.println("THe area of circle is "+area);
	}

}
