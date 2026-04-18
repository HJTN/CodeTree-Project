import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int aMath = s.nextInt(), aEng = s.nextInt(), bMath = s.nextInt(), bEng = s.nextInt();
        if (aMath > bMath && aEng > bEng) System.out.println(1);
        else System.out.println(0);
    }
}