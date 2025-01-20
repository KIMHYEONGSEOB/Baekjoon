import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 0 ; i < t ; i++) {
			String s = scan.nextLine();
			if(s.length()==1) {
				System.out.println(s.charAt(0)+""+s.charAt(0));
			}
			else {
			System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));
			}
		}
	}
}
