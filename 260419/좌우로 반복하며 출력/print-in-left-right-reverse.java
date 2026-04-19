import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= N; j++)
                    System.out.print(j);
            } else {
                for (int j = N; j > 0; j--)
                    System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}