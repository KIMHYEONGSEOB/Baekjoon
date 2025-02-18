import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        int n  = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1 ; i <= n; i++) {
            String a = sc.next();
            map.put(i+"", a);
            map2.put(a,i+"");
        }

        for(int i = 0 ; i < m; i++) {
            String a =sc.next();
            if(map.containsKey(a)){
                list.add(map.get(a));
            }else{
                list.add(map2.get(a));
            }
        };

        for(int i = 0 ; i < m ; i++){
            System.out.println(list.get(i));
        }

        }

}
