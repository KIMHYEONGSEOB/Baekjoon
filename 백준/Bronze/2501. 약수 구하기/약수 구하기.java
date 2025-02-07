import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int arr[] = new int[a];
		int index = 0;

		for(int i = 1 ; i <= a ; i++) {
			if(a % i == 0) {
				arr[index] = i;
				index++;
			}
		}
		if(arr[b-1] != 0) {
			System.out.println(arr[b-1]);
		}else {
			System.out.println("0");
		}

	}

}
