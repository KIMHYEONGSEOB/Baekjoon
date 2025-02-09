import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = 2;

        while(n != 1){
            if(n % m == 0){
                System.out.println(m);
                n /= m;
            }else{
                m++;
            }
        }
//        int arr[] = new int[n];
//        int  index = 0;
//        if(n == 1){
//            return;
//        }
        // 주어진 수의 소수찾기
//        for(int i =1 ; i<=n; i++){
//            int sum=0;
//            for(int j = 1 ; j <=i ; j++){
//                if(i%j==0){
//                    sum++;
//                }
//            }
//            if(sum==2){
//                arr[index++] = i;
//            }
//        }
//
//        //인수분해
//        index = 0;
//        while(true) {
//            if(arr[index] == 0 || n==0){
//                return;
//            }
//            if(n % arr[index] == 0){
//                System.out.println(arr[index]);
//              n =  n / arr[index];
//            }else{
//                index++;
//            }
//        }
    }
}
