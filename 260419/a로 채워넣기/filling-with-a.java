import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        System.out.println(a.substring(0, 1) + "a" + a.substring(2, a.length()-2) + "a" + a.substring(a.length()-1));
    }
}