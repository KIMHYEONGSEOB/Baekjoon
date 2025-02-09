import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if(a == 0 && b == 0 && c == 0){
                return;
            }
            int max = Math.max(a, Math.max(b, c));
            String s;

                if(a == b && b == c) {
                    s="Equilateral";
                }else if(a == b || b == c || a == c) {
                    s = "Isosceles";
                }else{
                    s = "Scalene";
                }

                if(max == a){
                    if(b+c <= a){
                        s = "Invalid";
                    }
                }else if(max == b){
                    if(a+c <= b){
                        s = "Invalid";
                    }
                }else {
                    if(a+b <= c){
                        s = "Invalid";
                    }
                }
            System.out.println(s);

        }
    }
}
