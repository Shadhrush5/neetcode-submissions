class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String key = convertStringToKey(strs[i]);
            if(map.containsKey(key)) {
                List<String> mutable = new ArrayList<>(map.get(key));
                mutable.add(strs[i]);
                map.put(key, mutable);
            } else {
                map.put(key, Arrays.asList(strs[i]));
            }
        }
        return new ArrayList<>(map.values());
    }

    private String convertStringToKey(String str) {
        int[] s = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            s[i] = str.charAt(i) - 'a';
        }
        Arrays.sort(s);
        return Arrays.toString(s);
    }
}
