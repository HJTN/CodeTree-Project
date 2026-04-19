import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                total += s.nextInt();
            }
            System.out.println(total);
        }
        s.close();
    }
}