import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int a = s.nextInt(), b = s.nextInt(), total = 0;
            for (int j = a; j <= b; j++) {
                if (j % 2 == 0) total += j;
            }
            System.out.println(total);
        }
        s.close();
    }
}