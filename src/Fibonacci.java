// 백준 1003
import java.util.Scanner;

public class Fibonacci implements Run {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] N = new int[T];
        for (int i = 0; i < T; i++) {
            N[i] = scanner.nextInt();
        }
        int[][] m = new int[41][2];
        m[0][0] = 1;
        m[0][1] = 0;
        m[1][0] = 0;
        m[1][1] = 1;
        for (int i = 2; i < 41; i++) {
            m[i][0] = m[i-1][0] + m[i-2][0];
            m[i][1] = m[i-1][1] + m[i-2][1];
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println(m[N[i]][0] + " " + m[N[i]][1]);
        }
    }
}
