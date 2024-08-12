
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        
        if(root == null) return result;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        Queue<Pair> queue = new LinkedList<>();
        
        queue.add(new Pair(root, 0));

        while(!queue.isEmpty()){
            Pair current = queue.poll();
            Node node = current.node;
            int hd = current.hd;

            map.put(hd, node.data);

            if(node.left != null){
                queue.add(new Pair(node.left, hd -1));
            }
            if(node.right != null){
                queue.add(new Pair(node.right, hd +1));
            }
        }
        for(Integer val : map.values()){
            result.add(val);
        }
        return result;
    }
}

class Pair{
    Node node;
    int hd;
    Pair(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}