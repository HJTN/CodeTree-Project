import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt(), B = s.nextInt();
        for (int i = B; i > A; i--) System.out.print(i + " ");
    }
}