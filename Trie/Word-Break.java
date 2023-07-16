public class wordbreak {
    static class Node {
        Node[] children;
        boolean eow; // end of word

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

    public static boolean search(String w) {
        Node curr = root;
        for (int i = 0; i < w.length(); i++) {
            int idx = w.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            if (i == w.length() - 1 && curr.children[idx].eow == false) {
                return false;
            }
            curr = curr.children[idx];

        }
        return true;
    }

    public static boolean wordBreak(String word) {
        if (word.length() == 0) {
            return true;
        }
        for (int i = 1; i <= word.length(); i++) {
            String s1 = word.substring(0, i);
            String s2 = word.substring(i);
            if (search(s1) && wordBreak(s2)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        // System.out.println(search("there"));
        // System.out.println(search("an"));
        // System.out.println(search("thor"));
        // System.out.println(search("a"));

        System.out.println(wordBreak("ilikesamsung"));

    }
}
