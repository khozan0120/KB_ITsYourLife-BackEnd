package BFS;

import java.util.ArrayDeque;
import java.util.Queue;

public class bfs_1 {
    public void bfs(List<List<Integer>> graph, int startVertex) {
        //====== 코드 작성 =====
//        시작점
        Queue<Integer> queue = new ArrayDeque<>();
//       visited hashmap,array
        queue.add(startVertex);
        visited = true;

        while ()
//            방문
            curVertex = queue.poll();
//        다음노드 예약
        for(nextVertex )

        //====================
    }

    public void solve(List<List<Integer>> graph) {
        bfs(graph, 0);
    }

    // 실행용 메소드
    public static void main(String[] args) {
        (new BFS()).solve(makeGraph());
    }

    public static List<List<Integer>> makeGraph() {
        return new ArrayList<>() {{
            add(List.of(1, 3, 6));
            add(List.of(0, 3));
            add(List.of(3));
            add(List.of(0, 1, 2, 7));
            add(List.of(5));
            add(List.of(4, 6, 7));
            add(List.of(0, 5));
            add(List.of(3, 5));
        }};
    }
}
