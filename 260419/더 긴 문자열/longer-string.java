import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next(), b = s.next();
        if (a.length() > b.length())
            System.out.print(a + " " + a.length());
        else if (a.length() == b.length())
            System.out.print("same");
        else
            System.out.print(b + " " + b.length());
    }
}