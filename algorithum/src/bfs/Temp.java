package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Temp {

    public static void main(String[] args) {
        String[] params = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution("hit", "cog", params));
    }

    public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];
        Queue<String> q = new LinkedList();
        q.offer(begin);

        while(!q.isEmpty()) {

            int size = q.size();

            for (int s = 0; s < size; s++) {
                String cur = q.poll();

                if ( cur.equals(target) ) {return answer;}

                for (int i = 0; i < words.length; i++) {
                    if (visited[i]) continue;

                    int same = 0;
                    for (int j = 0; j < cur.length(); j++) {
                        if (cur.charAt(j) == words[i].charAt(j)) same++;
                    }


                    if (same == cur.length() - 1) {
                        visited[i] = true;
                        q.offer(words[i]);
                    }
                }

            }
            answer++;
        }
        return 0;
    }


}