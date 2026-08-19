class Solution {
    private void bfs(int st , boolean[] visited, int [][]arr){
        Queue<Integer>  q = new LinkedList<>();
        q.add(st);
        visited[st]=true;

        while(!q.isEmpty()){
            int fr = q.poll();
            for (int i=0;i<arr.length;i++){
                if (arr[fr][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited[]=new boolean [n];
        int count=0;
        for (int i=0;i<n;i++){
            if (!visited[i]){
                bfs(i,visited, isConnected);
                count++;

            }
        }
        return count;
    }
}