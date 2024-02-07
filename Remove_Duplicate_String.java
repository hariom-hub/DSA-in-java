public class Remove_Duplicate_Strings {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {

        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
        }

        // work

        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        }
        // first come

        else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {

        String str = "appnnacollege";
        StringBuilder sb = new StringBuilder("");
        int idx = 0;
        boolean[] map = new boolean[26];
        removeDuplicates(str, idx, sb, map);

    }
}
