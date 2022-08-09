/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Node []cloneGraph = new Node[101];
        boolean []visited = new boolean[101];
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node n = queue.poll();
            if(!visited[n.val-1]){
                visited[n.val-1]=true;
                Node prev = cloneGraph[n.val-1];
                if(prev==null){
                    prev = new Node(n.val);
                    cloneGraph[n.val-1]=prev;
                }
                for(int i=0;i<n.neighbors.size();i++){
                    Node neighbor = n.neighbors.get(i);
                    Node curr = cloneGraph[neighbor.val-1];
                    if(!visited[neighbor.val-1]){
                        queue.add(neighbor);
                        if(curr==null){
                            curr = new Node(neighbor.val);
                            cloneGraph[neighbor.val-1] = curr;
                        }
                    }
                    prev.neighbors.add(curr);
                }
            }
        }
        return cloneGraph[0];
        
    }
}