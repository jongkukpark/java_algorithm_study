// 백준 17262번 미완

import java.util.Scanner;

public class OverFandom implements Run {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        boolean N[] = new boolean[100001];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < T; i++) {
            int mini = scanner.nextInt();
            int maxi = scanner.nextInt() - 1;
            min = Math.min(min, mini);
            max = Math.max(max, maxi);

            for (int j = mini; j <= maxi; j++) {
                N[j] = true;
            }
        }
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (N[i] == false)
                count++;
        }

        System.out.println(count);
    }
}
