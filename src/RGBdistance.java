// 백준 1149
import java.util.*;

public class RGBdistance implements Run {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] array = new int[N+1][3];

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int[][] m = new int[N + 1][3];
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            m[i][0] = Integer.min(m[i-1][1], m[i-1][2]) + array[i][0];
            m[i][1] = Integer.min(m[i-1][0], m[i-1][2]) + array[i][1];
            m[i][2] = Integer.min(m[i-1][0], m[i-1][1]) + array[i][2];
        }

        //System.out.println(Arrays.stream(m[N]).min().orElse(Integer.MIN_VALUE));
        System.out.println(Integer.min( Integer.min(m[N][0], m[N][1]) , m[N][2]));
    }
}
