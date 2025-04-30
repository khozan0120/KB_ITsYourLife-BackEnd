class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] checked = new boolean[n];
        int answer = 0;

        for (int node = 0; node < n; node++){
            if (!checked[node]){ // if(checked[node] == false)
                dfs(node, computers, checked);
                answer ++;
            }
        }
        return answer;
    }
    public void dfs(int curVertex,int[][] computers, boolean[] checked){
//        현재노드 방문
        checked[curVertex] = true;
//         (방문안함) 다음노드 DFS 실행
        for(int nextVertex = 0; nextVertex < computers[curVertex].length; nextVertex++){
            if(computers[curVertex][nextVertex] == 1 && !checked[nextVertex]){
                dfs(nextVertex, computers, checked);
            }
        }
    }
}


// 컴퓨터의 개수 n
// computers가 매개변수
// 네트워크 개수를 return