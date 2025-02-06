import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            int a= scan.nextInt();
            int b = scan.nextInt();
            if(a==0&&b==0) {
            	return;
            }
            String result = "neither";
            if(b%a == 0) {
            	result = "factor";
            }
            if(a%b == 0) {
            	result = "multiple";
            }
            System.out.println(result);
            
        }

    }
}
