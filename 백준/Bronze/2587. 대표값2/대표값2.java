import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List list = new ArrayList();
        int sum = 0;
        for(int i = 0 ; i < 5 ; i++) {
           int a = scan.nextInt();
            sum += a;
            list.add(a);
        }
        Collections.sort(list);

        int avg = sum / 5;
        System.out.println(avg + "\n" + list.get(2)  );
    }
}
