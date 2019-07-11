// 백준 11725 미완

import java.util.Scanner;

public class FindParentOfTree implements Run {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] array = new int[N+1][N+1];
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            array[a][b] = 1;
            array[b][a] = 1;
        }

        for (int i = 2; i <= N; i++) {
            nodePrint(array, 1, i);
        }
    }

    private void nodePrint(int[][] array, int start, int target) {

    }
}

