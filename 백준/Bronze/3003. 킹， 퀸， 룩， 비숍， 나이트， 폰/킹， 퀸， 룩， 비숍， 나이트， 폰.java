import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int ch[] = new int[6];
		
		ch[0] = 1;
		ch[1] = 1;
		ch[2] = 2;
		ch[3] = 2;
		ch[4] = 2;
		ch[5] = 8;
		
		for(int i = 0 ; i < 6 ; i++) {
			ch[i] -= scan.nextInt();
		}
		for(int i = 0 ; i < 6 ; i++) {
			System.out.print(ch[i]+" ");
		}
	}
}
