 public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);

    }
