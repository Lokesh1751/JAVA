//Approach 1
public static int Countofnodes(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int cnt=0;
        while (!q.isEmpty()) {
            Node cr = q.remove();
            cnt++; 
                if (cr.left != null) {
                    q.add(cr.left);
                }
                if (cr.right != null) {
                    q.add(cr.right);
                }
        }
        return cnt;
    }

//Approach 2 -> Optimized Approach
    public static int cntofnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftnodes=cntofnodes(root.left);
        int rightnodes=cntofnodes(root.right);
        return leftnodes+rightnodes+1;
    }
