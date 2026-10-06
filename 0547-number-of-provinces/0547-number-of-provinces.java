class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean[] visited=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                count++;
            }
          
        }
        return count;
    }

    void dfs(int start,int[][] isConnected,boolean[] visited){
        visited[start]=true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[start][j]==1 && !visited[j]){
                dfs(j,isConnected,visited);
            }
        }
    }
}