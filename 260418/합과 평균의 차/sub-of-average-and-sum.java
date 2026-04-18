import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        int sum = a + b + c, avg = (a + b + c) / 3;
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum - avg);
    }
}