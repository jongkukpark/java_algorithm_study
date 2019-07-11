// 백준 17298 안해시발아 시간초과

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class RightBigLeft implements Run {
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int N = Integer.parseInt(br.readLine());
            int array[] = new int[N];
            String a = br.readLine();
            StringTokenizer st = new StringTokenizer(a);
            for (int i = 0; i < N; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < N; i++) {
                Stack<Integer> stack = new Stack<>();
                for (int j = N - 1; j >= i; j--) {
                    stack.push(array[j]);
                }
                int check = stack.pop();
                int NGE = -1;
                while (!stack.isEmpty()) {
                    int e = stack.pop();
                    if (check < e) {
                        NGE = e;
                        break;
                    }
                }
                bw.write(NGE + " ");
            }
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
