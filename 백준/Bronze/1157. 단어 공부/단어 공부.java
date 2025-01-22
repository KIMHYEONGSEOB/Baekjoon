import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		char[] arr = scan.next().toUpperCase().toCharArray();
		char[] arr2 = new char[26];
		int[] arr3 = new int[26];
		char answer = 'A';
		int index = 0;
		for(char i = 'A' ; i <= 'Z' ; i++) {
			arr2[index] = i;
			index++;
		}
		re : for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr2.length ; j++) {
				if(arr[i] == arr2[j]) {
					arr3[j] +=1;
					continue re;
				}
			}
		}
		int max = 0;
		for(int i = 0; i <26 ; i++) {
			if(max<arr3[i]) {
				max = arr3[i];
				answer = (char)(i+65);
			}
			else if(max == arr3[i]) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}