class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int len = s.length();
        int[] a = new int[len];
        int[] b = new int[len];

        for (int i = 0 ; i < len; i++) {
            a[i] = s.charAt(i) - 'a';
            b[i] = t.charAt(i) - 'a';
        }

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.toString(a).equals(Arrays.toString(b));
    }
}
