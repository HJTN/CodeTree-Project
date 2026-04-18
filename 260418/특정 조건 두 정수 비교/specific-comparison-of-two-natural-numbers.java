import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt(), B = s.nextInt();
        if (A < B) System.out.print(1);
        else System.out.print(0);
        System.out.print(" ");
        if (A == B) System.out.println(1);
        else System.out.println(0);
    }
}