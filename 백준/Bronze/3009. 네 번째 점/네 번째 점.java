import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x[] = new int[3];
        int y[] = new int[3];
        for(int i = 0 ; i <3 ; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();

        }

            if(x[0] == x[1]){
                System.out.print(x[2]);
            }else if(x[0] == x[2]){
                System.out.print(x[1]);
            }else{
                System.out.print(x[0]);
             }

            if(y[0] == y[1]){
                System.out.println(" " + y[2]);
            } else if(y[0] == y[2]){
                System.out.println(" " + y[1]);
            } else{
                System.out.println(" " + y[0]);
            }

    }
}
