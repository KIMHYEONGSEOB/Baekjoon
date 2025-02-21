import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int pactorial = 1;

    for(int i = 1; i <= n; i++) {
        pactorial *= i;
    }
    System.out.println(pactorial);
}

}
