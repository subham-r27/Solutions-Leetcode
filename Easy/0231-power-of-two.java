//Optimal
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        else if((n & (~(n-1))) == n) return true;
        return false;
    }
}

// OR
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        else if((n & (n-1))==0) return true;
        return false;
    }
}






// EXPLANATION BELOW ----------------------------------------------------------------
/* 
8 - 001000
7 - 000111
~7 - 111000
 so, 8 & ~7 - 001000 which is 8
 so, if n & ~(n-1)  is equal to n then it is power of n
*/

//Brute
class Solution {
    public boolean isPowerOfTwo(int n) {
        String s="";
        while(n!=0){
            if(n%2==1) s+="1";
            else s+="0";
            n=n/2;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }
        if(count==1) return true;
        return false;
    }
}
