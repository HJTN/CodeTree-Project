import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] c = new String[10];
        for (int i = 0; i < 10; i++)
            c[i] = s.next();
        
        for (int i = 9; i >= 0; i--)
            System.out.print(c[i]);

        s.close();
    }
}