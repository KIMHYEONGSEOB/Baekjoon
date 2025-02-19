import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int []arr = new int [n];
        for(int i = 0; i < n; i++) {
            arr[i] = parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int array : arr) {
            sb.append(array).append("\n");
        }
        System.out.print(sb);

    }
}
