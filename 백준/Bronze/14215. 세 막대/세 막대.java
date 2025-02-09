import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));

        if(max==a){
            while(b + c <= a){
                a--;
            }
        }else if(max==b) {
            while (a + c <= b) {
                b--;
            }
        }else{
            while (a + b <= c) {
                c--;
            }
        }
        System.out.println(a+b+c);
    }
}
