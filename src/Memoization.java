// 백준 1463

import java.util.Scanner;

public class Memoization implements Run {
    @Override
    public void run() {
        int T = new Scanner(System.in).nextInt();
        int d[] = new int[T+1];
        if (T>=2)
            d[2] = 1;
        if (T>=3)
            d[3] = 1;
        if (T>=4) {
            for (int i = 4; i <= T; i++) {
                d[i] = d[i-1] + 1;
                if (i % 2 == 0)
                    d[i] = Math.min(d[i], d[i/2] + 1);
                if (i % 3 == 0)
                    d[i] = Math.min(d[i], d[i/3] + 1);
            }
        }

        System.out.println(d[T]);
    }
}
