import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j % 2 == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(N - i + 1);
                }
            }
            System.out.println();
        }
        s.close();
    }
}