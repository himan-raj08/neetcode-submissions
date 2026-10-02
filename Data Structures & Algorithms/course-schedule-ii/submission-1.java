class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<>());

        int[] indegree = new int[numCourses];

        for(int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }



      Queue<Integer> q =new LinkedList<>();
     
        for(int i=0;i<numCourses;i++) {
            if(indegree[i]==0) {
                q.add(i);
            }
        }

        int[] ans = new int[numCourses];
        int idx = 0;
        while(!q.isEmpty()){
            int node =q.poll();
          ans[idx++] =node;

            for(int it:adj.get(node)) {
                indegree[it]--;

                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        if(idx!=numCourses){
            return new int[0];

        }
            return ans;
        
        
    }
}
