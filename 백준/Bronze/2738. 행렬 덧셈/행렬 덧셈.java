import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[][] arr = new int [a][b];
		int[][] arr2 = new int[a][b];
		for(int i = 0 ; i < a ; i++) {
			for(int j = 0 ; j < b ; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i = 0 ; i < a ; i++) {
			for(int j = 0 ; j < b ; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}
		for(int i = 0 ; i < a ; i++) {
			for(int j = 0 ; j < b ; j++) {
				System.out.print(arr[i][j] + arr2[i][j]+" ");
			}
			System.out.println();
		}
		

	}
}
