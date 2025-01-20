import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String arr[] = scan.nextLine().trim().split(" ");
		if(arr[0].equals("")) {
			System.out.println("0");
		}else {
			System.out.println(arr.length);
		}
	}
}
