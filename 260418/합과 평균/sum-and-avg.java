import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt(), B = scan.nextInt();
        System.out.println((A + B) + " " + ((A + (double)B) / 2));
    }
}