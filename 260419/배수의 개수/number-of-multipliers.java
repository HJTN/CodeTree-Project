import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cnt3 = 0, cnt5 = 0, tmp;
        
        for (int i = 0; i < 10; i++) {
            tmp = s.nextInt();
            if (tmp % 3 == 0) cnt3 += 1;
            if (tmp % 5 == 0) cnt5 += 1;
        }
        System.out.print(cnt3 + " " + cnt5);
        
        s.close();
    }
}