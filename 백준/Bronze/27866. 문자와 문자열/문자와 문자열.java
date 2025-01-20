import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		int i = scan.nextInt();
		char c = s.charAt(i-1);
		System.out.println(c);
		
	}
}