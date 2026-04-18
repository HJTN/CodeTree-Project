import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int gender = s.nextInt(), age = s.nextInt();
        if (gender == 0) {
            if (age >= 19)
                System.out.println("MAN");
            else
                System.out.println("WOMAN");
        } else {
            if (age >= 19)
                System.out.println("BOY");
            else
                System.out.println("GIRL");
        }
    }
}