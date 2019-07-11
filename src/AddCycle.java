// 백준 1110번
import java.util.Scanner;

public class AddCycle implements Run {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;
        int number =N;
        do {
            int front = number / 10;
            int back = (number % 10);
            int result = front + back;
            number = (back * 10)  + (result % 10);
            count++;
        }
        while (N != number);
        System.out.println(count);
    }
}
