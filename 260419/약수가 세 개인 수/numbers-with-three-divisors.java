import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int start = s.nextInt(), end = s.nextInt(), total = 0;
        for (int i = start; i <= end; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt += 1;
            }
            if (cnt == 3) total += 1;
        }
        System.out.println(total);
    }
}