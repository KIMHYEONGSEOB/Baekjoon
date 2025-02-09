import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int min = n;
		int answer = 0;

		for (int i = m; i <= n ; i++) {
			int sum = 0;
			for (int j = 1; j <= i ; j++) {
				if (i % j == 0) {
                    sum++;
                }
			}
			if (sum == 2) {
                answer += i;
                if(min>i){
					min = i;
				}
            }
		}
		if (answer == 0){
			System.out.println(-1);
		}else{
			System.out.println(answer);
            System.out.println(min);
		}

	}
}
