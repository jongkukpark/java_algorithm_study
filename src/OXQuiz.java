// 백준 8958

import java.util.Scanner;

public class OXQuiz implements Run {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            String a = scan.next();
            int sum = 0;
            int count = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == 'O') {
                    ++count;
                    sum += count;
                }
                else
                    count = 0;
            }
            System.out.println(sum);
        }
    }
}
