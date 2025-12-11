import java.util.*;

public class DFSGraph {
    static void dfs(List<List<Integer>> g, boolean[] vis, int node) {
        vis[node] = true;
        System.out.print(node+" ");
        for(int x:g.get(node)) {
            if(!vis[x]) dfs(g,vis,x);
        }
    }
    public static void main(String[] args) {
        int v = 5;
        List<List<Integer>> g = new ArrayList<>();
        for(int i=0;i<v;i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(0).add(2);
        g.get(1).add(3);
        g.get(2).add(4);

        boolean[] vis = new boolean[v];
        dfs(g,vis,0);
    }
}
