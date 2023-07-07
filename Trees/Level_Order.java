public static void Levelorder(Node root) {
        if(root==null){
        return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node cr = q.remove();
            if (cr == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(cr.data + " ");
                if (cr.left != null) {
                    q.add(cr.left);
                }
                if (cr.right != null) {
                    q.add(cr.right);
                }
            }
        }
    }
