import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cnt = 0;
        for (int i = 0; i < 4; i++) {            
            for (int j = 0; j < 4; j++) {
                if (s.nextInt() % 5 == 0) cnt += 1;
            }
        }
        System.out.println(cnt);
        s.close();
    }
}