import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long sum = 0;
        long result = 0;
        for(int i = 0 ; i < n-1 ; i++){
            sum += i;
            result += sum;
        }
        System.out.println(result);
        System.out.println(3);
    }
}
