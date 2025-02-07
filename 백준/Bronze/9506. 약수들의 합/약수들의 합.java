import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		while(true) {
			int n = scan.nextInt();
			if(n == -1) {
				return;
			}
			int arr[] = new int[n];
			int index = 0;
			int sum = 0;

			for(int i = 1 ; i < n ; i++) {
				if(n % i == 0) {
					arr[index] = i;
					index++;
					sum += i ;
				}
			}
			if(sum==n) {
				System.out.print(n+" = ");
				for(int j = 0; j < n ; j++) {
					if(arr[j+1]==0) {
						System.out.println(arr[j]);
						break;
					}
					System.out.print(arr[j]+" + ");
				}
			}else {
				System.out.print(n+" ");
				System.out.println("is NOT perfect.");
			}
		}
	}
}
