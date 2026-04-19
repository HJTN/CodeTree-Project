import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < 4; i++) {            
            for (int j = 0; j < 4; j++) {
                int tmp = s.nextInt();
                if (j <= i) total += tmp;
            }
        }
        System.out.println(total);
        s.close();
    }
}