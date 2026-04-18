import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = s.nextInt();
        
        for (int i = N-1; i >= 0; i--) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
        s.close();
    }
}