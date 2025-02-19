import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
           sb.append(integer).append("\n");
        }
        System.out.print(sb);
    }
}
