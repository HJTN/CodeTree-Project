import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] strs = {"apple", "banana", "grape", "blueberry", "orange"};
        String target = s.next();
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (strs[i].substring(2, 3).compareTo(target) == 0 || strs[i].substring(3, 4).compareTo(target) == 0) {
                System.out.println(strs[i]);
                cnt += 1;
            }
        }
        System.out.println(cnt);
        s.close();
    }
}