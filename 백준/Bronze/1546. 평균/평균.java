import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double arr[] = new double[n];
		double m = arr[0];
		double result = 0;
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = scan.nextInt();
			if(m < arr[i]){
				m = arr[i];
			}
		}
		for(int i = 0 ; i < n ; i++) {
			result += arr[i]/m*100;
		}
		System.out.println(result/n);
		
	}
}
