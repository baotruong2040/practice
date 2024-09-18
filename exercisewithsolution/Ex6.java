package practice;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		final float pi=3.1415f;
		Scanner k = new Scanner(System.in);
		System.out.print("Input radius r= ");
		r = k.nextDouble();
		System.out.println("Circle area = "+r*r*pi);
		System.out.println("Circle perimeter = " +2*r*pi);
	}

}
