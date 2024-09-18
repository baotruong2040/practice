package src;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		double n, SinN, CosN;
		Scanner k = new Scanner(System.in);
		System.out.print("input number n: ");
		n = k.nextDouble();
		SinN = Math.sin(n);
		CosN = Math.cos(n);
		System.out.println("Sin(n)= " +SinN);
		System.out.println("Cos(n)= " +CosN);
		System.out.println("Sqrt of N=" +Math.sqrt(n));
	}

}
