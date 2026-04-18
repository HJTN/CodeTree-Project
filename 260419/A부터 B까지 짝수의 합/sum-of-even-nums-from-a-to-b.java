import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt(), B = s.nextInt(), total = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 1)
                continue;
            total += i;
        }
        System.out.println(total);
    }
}