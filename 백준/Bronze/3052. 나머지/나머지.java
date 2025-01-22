import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[42];
		int a;
		int result=0;
		for(int i = 0 ; i < 10 ; i++) {
			a = scan.nextInt() % 42;
			arr[a] = 1;
		}
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == 1) {
				result++;
			}
		}
		System.out.println(result);
	}
}