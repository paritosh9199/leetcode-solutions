import java.util.*;

public class p49_group_anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List l = new ArrayList<ArrayList<String>>();

        // Map<String, String> sortedMap = new EnumMap<String, String>();

        for (int i = 0; i < strs.length; i++) {
            String sortedI = "";
            if (strs[i] != "-1") {
                // if (!sortedMap.containsKey(strs[i])) {
                    char[] ai = strs[i].toCharArray();
                    Arrays.sort(ai);
                    sortedI = new String(ai);
                    // sortedMap.put(strs[i], sortedI);
                // } else {
                //     sortedI = sortedMap.get(strs[i]);
                // }
            } else {
                continue;
            }

            List k = new ArrayList<String>();

            for (int j = i; j < strs.length; j++) {
                String sortedJ = "";
                if (i == j) {
                    sortedJ = sortedI;
                } else {
                    // if (!sortedMap.containsKey(strs[j])) {
                        char[] aj = strs[j].toCharArray();
                        Arrays.sort(aj);
                        sortedJ = new String(aj);
                        // sortedMap.put(strs[j], sortedJ);
                    // } else {
                    //     sortedJ = sortedMap.get(strs[j]);
                    // }
                }
                if (strs[j] != "-1") {
                    if (sortedI.equals(sortedJ)) {
                        // System.out.println(" > "+i+" "+ j +
                        // "|"+strs[j]+"|"+sortedStrs[i]+"|"+sortedStrs[j]);
                        k.add(strs[j]);
                        strs[j] = "-1";
                    }
                }
            }

            if (k.size() > 0) {
                l.add(k);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        String[] testcase1 = { "eat", "tea", "tan", "ate", "nat", "bat" };

        p49_group_anagram s = new p49_group_anagram();
        System.out.println(s.groupAnagrams(testcase1));
    }
}
