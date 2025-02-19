import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            if(a==0 && b==0 && c==0) break;
            int max = Math.max(Math.max(a,b),c);
            String answer;
            if(max == a){
                answer = a*a == b*b + c*c? "right" : "wrong";
            }else if(max == b){
                answer = b*b == a*a + c*c? "right" : "wrong";
            }else{
                answer = c*c == a*a + b*b? "right" : "wrong";
            }
            System.out.println(answer);
        }


    }
}
