import java.io.*;
import java.util.StringTokenizer;

public class FastAplusB implements Run {
    @Override
    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
                bw.write(a + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
