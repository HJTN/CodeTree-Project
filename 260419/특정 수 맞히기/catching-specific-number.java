import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        while (true) {
            if (num < 25) System.out.println("Higher");
            else if (num == 25) {
                System.out.println("Good");
                break;
            }
            else System.out.println("Lower");
            num = s.nextInt();
        }
        s.close();
    }
}