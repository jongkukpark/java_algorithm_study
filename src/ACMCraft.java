// 백준 1005 미완

import java.util.*;

public class ACMCraft implements Run {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();

            int term[] = new int[N+1];

            for (int j = 1; j <= N; j++) {
                term[j] = scanner.nextInt();
            }

            int[] building = term.clone();
            ArrayList<build> list = new ArrayList<>();
            int[] indegree = new int[K+1];
            for (int j = 1; j <= K; j++) {
                int start = scanner.nextInt();
                int end = scanner.nextInt();
//                building[end]= Math.max(term[end] + building[start], building[end]);
                list.add(new build(start, end));
                indegree[end]++;
            }

            Queue<build> queue = new LinkedList<>();
            for (int j = 1; j <= K; j++) {
//                if (indegree[j] == 0)
//                    queue.offer(list.get())
//            }

//            Collections.sort(list);


//            for (build b :
//                    list) {
//                building[b.end]= Math.max(term[b.end] + building[b.start], building[b.end]);
//            }

            int win = scanner.nextInt();
            System.out.println(building[win]);
        }
    }
}

class build implements Comparable<build> {
    int start;
    int end;

    public build(int start, int b) {
        this.start = start;
        this.end = b;
    }

    @Override
    public int compareTo(build o) {
        if (end > o.end) {
            return 1;
        }
        else if (end == o.end) {
            if (start > o.start) {
                return 1;
            }
            else
                return -1;
        }
        return -1;
    }
}}
