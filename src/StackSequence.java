// 백준 1874

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackSequence implements Run {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        Stack<Integer> stack = new Stack<>();
        int pushCounter = 0;
        StringBuilder result = new StringBuilder();
        while (!(pushCounter == n)) {
            int num = 0;
            if (!queue.isEmpty()) {
                num = queue.poll();
            }

            for (int i = pushCounter; i < num; i++) {
                stack.push(i);
                result.append("+\n");
                pushCounter++;
            }
            int pop = stack.pop();
            if (pop != num-1) {
                result.delete(0, result.length());
                result.append("NO");
                break;
            }
            else {
                result.append("-\n");
            }
        }
        while (!queue.isEmpty()) {
                if (stack.pop() != (queue.poll()-1)) {
                    result.delete(0, result.length());
                    result.append("NO");
                    break;
                }
                else {
                    result.append("-\n");
                }
        }
        System.out.println(result.toString());
    }
}
