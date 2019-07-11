// 백준 2747

import java.util.Scanner;

public class Fibonacci1 implements Run {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long array[] = new long[91];
        array[0] = 0;
        array[1] = 1;
            for (int i = 2; i <= n; i++) {
                array[i] = array[i-1] + array[i-2];
            }
        System.out.println(array[n]);
    }
}
