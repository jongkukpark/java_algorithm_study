// 백준 1065

import java.util.ArrayList;
import java.util.Scanner;

public class Hansu implements Run {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        System.out.println(getHansu(X));
    }

    private int getHansu(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isHansu(i))
                count++;
        }
        return count;
    }

    private boolean isHansu(int n) {
        int length = getLengthOfInt(n);
        if (length <= 2)
            return true;
        else {
            return isOrder(n);
        }
    }

    private boolean isOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = n;
        for (int i = 0; i < getLengthOfInt(n); i++) {
            list.add(a%10);
            a /= 10;
        }
        for (int i = 1; i < list.size() - 1; i++) {
            if (!(list.get(i-1) - list.get(i) ==
                    list.get(i) - list.get(i +1)))
                return false;
        }
        return true;
    }

    private int getLengthOfInt(int n) {
        return (int)(Math.log10(n)+1);
    }
}
