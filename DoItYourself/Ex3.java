package src;
import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		double high, width;
		Scanner k = new Scanner(System.in);
		System.out.print("Input the high and width: ");
		high = k.nextDouble();
		width = k.nextDouble();
		System.out.println("Rectangle Area= "+high*width);
		System.out.println("Rectangle perimeter= "+(high+width)*2);
		}
}
