import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		int b = scan.nextInt();
		System.out.println(Integer.parseInt(n, b));

	}
}
