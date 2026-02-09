// HASHMAP----------------------------------------------
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c,map.getOrDefault(c, 0) + 1);
        for (char c : t.toCharArray()) {
            map.put(c,map.getOrDefault(c, 0) - 1);
            if (map.get(c)<0) return false;
        }
        return true;
    }
}


//BRUTE-----------------------------------------=----
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        for (int i = 0; i < s.length(); i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true; 
    }
}
