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

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("there"));
        System.out.println(search("an"));
        System.out.println(search("thor"));
        System.out.println(search("a"));

    }
}
