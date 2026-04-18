import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt(), B = s.nextInt();
        int num = A;
        while (num <= B) {
            System.out.print(num + " ");
            if (num % 2 == 0) num += 3;
            else num *= 2;
        }
        s.close();
    }
}