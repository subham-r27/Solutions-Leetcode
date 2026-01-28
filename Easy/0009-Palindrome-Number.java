class Solution {
    public boolean isPalindrome(int x) {
        int rev,t;
        t=x;rev=0;
        while(t>0){
            rev=rev*10+t%10;
            t=t/10;
        }
        return rev==x;
    }
}

/* 
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
*/
