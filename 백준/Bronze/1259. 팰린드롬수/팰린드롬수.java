import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while(true){
            String str = scan.next();
            StringBuilder sb = new StringBuilder(str);
            String n = String.valueOf(sb.reverse());
            if (str.equals("0")){
                break;
            }
            if(n.equals(str)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
