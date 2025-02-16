import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            list.add(scanner.nextInt());

        }
       Collections.sort(list);

        for(int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
}
