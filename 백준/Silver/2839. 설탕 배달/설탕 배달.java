import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;


        while (n >= 0) {
            if (n % 5 != 0) {
                n -= 3;
                sum += 1;
            } else {
                System.out.println(n / 5 + sum);
                return;
            }
 
        }
        System.out.println(-1);

    }
}
