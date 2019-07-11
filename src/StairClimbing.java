// 백준 2579

import java.util.Scanner;

public class StairClimbing implements Run {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] N = new int[301];
        for (int i = 1; i <= T; i++) {
            N[i] = scanner.nextInt();
        }

        int[] a = new int[T+1];
        a[1] = N[1];
        a[2] = N[1]+N[2];
        for (int i = 3; i <= T; i++) {
            a[i] = Integer.max(a[i-2] + N[i], a[i-3] + N[i-1] + N[i]);
        }

        System.out.println(a[T]);
    }
}
