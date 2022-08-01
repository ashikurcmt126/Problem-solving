class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        Graph g = new Graph(n);
        
        for(int i = 0 ; i < edges.length; i++){
            g.addEdge(edges[i][0],edges[i][1]);
            g.addEdge(edges[i][1],edges[i][0]);
        }
        boolean[] visited = new boolean[n];
        
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(source);
        visited[source] =true;
        while(!q.isEmpty()){
            int current = q.poll();
             Iterator<Integer> i = g.adj[current].listIterator();
            while (i.hasNext())
            {
                int next = i.next();
                if(next == destination) return true;
                if (!visited[next])
                {
                    visited[next] = true;
                    q.add(next);
                   
                }
            }
            
            
        }
        
        return false;
    }
    class Graph
{
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
 
    // Constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
}
}
