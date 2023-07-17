import java.util.*;

public class countuniquesubstr {
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

    public static int Countuniqsub(Node curr) {
        if (curr == null) {
            return 0;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null) {
                cnt += Countuniqsub(curr.children[i]);
            }

        }
        return cnt + 1;
    }

    public static void main(String[] args) {
        String str = "ababa";
        ArrayList<String> al = new ArrayList<>();
        // step 1 => create trie of all possible suffix of the particular string suffix
        // means from last same as prefix means from first

      // step 2=> count number of nodes in trie
      // number of unique prefix = number of nodes in trie
        for (int i = 0; i < str.length(); i++) {
            insert(str.substring(i));
            al.add(str.substring(i));
        }
        System.out.println(Countuniqsub(root));

    }
}
