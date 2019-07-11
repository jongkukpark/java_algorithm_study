// 백준 14647 최적화 안됨

import java.util.Scanner;

public class Birdsphobia implements Run {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int colunm = scanner.nextInt();

        int bingo[][] = new int[row + 1][colunm + 1];

        bingo = inputTwoDivisionArray(bingo);

        int rowNum = 0;
        int rowMax = Integer.MIN_VALUE;

        for (int i = 1; i <= row; i++) {
            int count = 0;
            count = getSum(colunm, bingo, count, i);
            if (count > rowMax) {
                rowMax = count;
                rowNum = i;
            }
        }

        int colNum = 0;
        int colMax = Integer.MIN_VALUE;

        for (int j = 1; j <= colunm; j++) {
            int count = 0;
            for (int i = 1; i <= row; i++) {
                String a = String.valueOf(bingo[i][j]);
                for (int k = 0; k < a.length(); k++) {
                    if (a.charAt(k) == '9')
                        count++;
                }
            }
            if (count > colMax) {
                colMax = count;
                colNum = j;
            }
        }

        if (colMax>rowMax) {
            for (int i = 1; i <= row; i++) {
                bingo[i][colNum] = 0;
            }
        }
        else {
            for (int j = 1; j <= colunm; j++) {
                bingo[rowNum][j] = 0;
            }
        }

        int sum = 0;
        for (int i = 1; i <= row; i++) {
            sum = getSum(colunm, bingo, sum, i);
        }

        System.out.println(sum);
    }

    private int getSum(int colunm, int[][] bingo, int sum, int i) {
        for (int j = 1; j <= colunm; j++) {
            String a = String.valueOf(bingo[i][j]);
            for (int k = 0; k < a.length(); k++) {
                if (a.charAt(k) == '9')
                    sum++;
            }
        }
        return sum;
    }

    public int[][] inputTwoDivisionArray(int[][] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                array[i][j] = input().nextInt();
            }
        }

        return array;
    }

    public Scanner input() {
        return new Scanner(System.in);
    }
}
