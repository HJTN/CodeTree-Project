import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(), M = s.nextInt();
        int[][] arr1 = new int[N][M], arr2 = new int[N][M], arr3 = new int[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                arr1[i][j] = s.nextInt();
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                arr2[i][j] = s.nextInt();
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++) {
                if (arr1[i][j] == arr2[i][j]) arr3[i][j] = 0;
                else arr3[i][j] = 1;
            }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(arr3[i][j] + " ");
            System.out.println();
        }
        s.close();
    }
}