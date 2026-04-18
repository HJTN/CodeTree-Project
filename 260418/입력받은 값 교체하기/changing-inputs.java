import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(), b = scan.nextInt(), t;
        t = a; a = b; b = t;
        System.out.println(a + " " + b);
    }
}