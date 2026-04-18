import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tem = s.nextInt();
        if (tem >= 100) System.out.println("vapor");
        else if (tem < 0) System.out.println("ice");
        else System.out.println("water");
    }
}