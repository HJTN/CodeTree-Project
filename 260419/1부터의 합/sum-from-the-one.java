import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(), sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum >= N) {
                System.out.println(i);
                break;
            }
        }
    }
}