package practice;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		char ch;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a character: ");
		ch = keyboard.next().charAt(0);
		System.out.println("ASCII code of " + ch +" is "+(byte)ch);
	}
}
