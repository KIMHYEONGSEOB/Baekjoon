import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        System.out.print(Math.min(x > (w / 2) ? w - x : x, y > (h / 2) ? h - y : y));

    }
}
