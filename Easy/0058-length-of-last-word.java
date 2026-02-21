class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else break;
        }
        return count;
    }
}




//Different approach
class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;int count=0;
        while(i >= 0){
            while(i >=0 && s.charAt(i)==' ') i--;
            if(i<0) break;
            while(i >=0 && s.charAt(i)!=' '){
                i--;
                count++;
            }
            break;
        }
        return count;
    }
}


