class Solution {
    public String reverseByType(String s) {
        List<Character> letters=new ArrayList<>();
        List<Character> special=new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            } else {
                special.add(ch);
            }
        }
        Collections.reverse(letters);
        Collections.reverse(special);

        StringBuilder result = new StringBuilder();
        int li = 0, si = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append(letters.get(li++));
            } else {
                result.append(special.get(si++));
            }
        }
        return result.toString();
    }
}
