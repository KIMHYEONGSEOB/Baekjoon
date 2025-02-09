import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];

        for(int i = 0 ; i < n; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }

        int xmin = x[n-1];
        int ymin = y[n-1];
        int xmax = x[0];
        int ymax = y[0];

        for(int i = 0 ; i < n; i++) {
            if (xmin > x[i]){
                xmin = x[i];
            }
            if(ymin > y[i]){
                ymin = y[i];
            }
            if(xmax < x[i]){
                xmax = x[i];
            }
            if(ymax < y[i]){
                ymax = y[i];
            }
        }
        System.out.println((xmax-xmin)*(ymax-ymin));

//        for(int i = 0 ; i < n-1; i++) {
//            xmin = Math.min(x[i], x[i+1]);
//            ymin = Math.min(y[i], y[i+1]);
//        }

//        for(int i = 0 ; i < n-1; i++) {
//            xmax = Math.max(x[i], x[i+1]);
//            ymax = Math.max(y[i], y[i+1]);
//        }
//
//        //가로변
//        int width = (xmax- xmin);
//        //세로변
//        int height = (ymax-ymin);
//

    }
}
