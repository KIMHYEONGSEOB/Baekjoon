import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long sum = 0;
        for(int i = 1 ; i < n ; i++) {
            sum += i;

        }
        System.out.println(sum);
        System.out.println(2);
    }
}
