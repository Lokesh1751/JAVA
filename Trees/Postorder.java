 public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data + " ");

    }
