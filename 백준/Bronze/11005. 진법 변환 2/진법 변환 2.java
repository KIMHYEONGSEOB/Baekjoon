import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int b = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		int r = n % b;
		
        //r의 수가 10이상이면 알파벳으로 변환
		if(r >= 10) {
			sb.append((char)(55+(r)));
		}else {
			sb.append(r);
		}
		r = n / b;
        
		while(r!=0) {
            //r의 수가 10이상이면 알파벳으로 변환
			if(r % b >= 10) {
				 sb.append((char)(55 + (r % b)));
			}else {
			sb.append(r % b);
			}
			r /= b;
		}
		System.out.println(sb.reverse().toString());
	}

}
