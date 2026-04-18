import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt(), N = s.nextInt();
        for (int i = 0; i < N; i++) {
            A += N;
            System.out.println(A);
        }
    }
}