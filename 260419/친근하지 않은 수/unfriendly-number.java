import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int num = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0)
                continue;
            num += 1;
        }
        System.out.println(num);
    }
}