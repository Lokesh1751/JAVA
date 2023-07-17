public class Longestwordwithallprefix {
    public static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;

        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                // add new node
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }
// find longest string whose all prefix are present in the particular words array
    public static String ans = "";

    public static void longestword(Node curr, StringBuilder temp) {
        if (curr == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null && curr.children[i].eow == true) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestword(curr.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }

        }
    }

    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        StringBuilder temp = new StringBuilder("");
        longestword(root, temp);
        System.out.println(ans);
    }
}
