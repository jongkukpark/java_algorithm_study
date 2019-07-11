// 백준 1932

import java.util.Scanner;

public class IntegerTriangle implements Run {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[][] d = new int[T+1][T+1];

        for (int i = 1; i <= T; i++) {
            for (int j = 1; j <= i; j++) {
                d[i][j] = scanner.nextInt();
            }
        }

        int max = 0;
        for (int i = 1; i <= T; i++) {
            for (int j = 1; j <= i; j++) {
                d[i][j] = max(d[i-1][j-1], d[i-1][j]) + d[i][j];
                max = max(max, d[i][j]);
            }
        }

        System.out.println(max);
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }
}
