import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stk.nextToken());
		int b = Integer.parseInt(stk.nextToken());
		int v = Integer.parseInt(stk.nextToken());
		
		int result;
		int answer = 0;

		result = (v-a) % (a-b)!=0? (v - a) / (a-b) +1 :(v - a) / (a-b)  ; 
		
		
		bw.write(String.valueOf(++result));
			
		bw.flush();
		bw.close();
		
//			answer++;
//			if(v<=0) {
//				bw.write(String.valueOf(answer));
//				bw.flush();
//				bw.close();
//				return;
//			}
	}
}
