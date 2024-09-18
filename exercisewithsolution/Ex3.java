package practice;
import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		byte ASCIIcode;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input an ASCIIcode: ");
		ASCIIcode = keyboard.nextByte();
		System.out.print("ASCII code "+ ASCIIcode + " is " + (char)ASCIIcode);
	}
}
