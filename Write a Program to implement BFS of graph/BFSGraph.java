import java.util.*;

public class BFSGraph {
    public static void main(String[] args) {
        int v = 5;
        List<List<Integer>> g = new ArrayList<>();
        for(int i=0;i<v;i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(0).add(2);
        g.get(1).add(3);
        g.get(2).add(4);

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[v];
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node+" ");
            for(int x : g.get(node)) {
                if(!vis[x]) {
                    vis[x] = true;
                    q.add(x);
                }
            }
        }
    }
}
