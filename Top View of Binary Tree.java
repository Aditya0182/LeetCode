class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> res = new ArrayList<>();
      leftviewHelper(root,0,res);
      return res;
      
      
    }
    private void leftviewHelper(Node root,int level, List<Integer> res){
        if(root ==null){
            return;
        }
        if(res.size()==level){
            res.add(root.data);
        }
        leftviewHelper(root.left,level+1,res);
         leftviewHelper(root.right,level+1,res);
    }
}