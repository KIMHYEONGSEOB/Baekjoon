import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - k));
    }
}
