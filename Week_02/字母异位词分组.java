class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String,List<String>> map = new HashMap<>();

        for (String s:strs) {
            char[] ca = new char[26];
            for (char c:s.toCharArray()) {
                ca[c-'a']++;
            } 

            String str = String.valueOf(ca);
            if (!map.containsKey(str)) {
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(s);

        } 

        return new ArrayList<>(map.values());

    }
}