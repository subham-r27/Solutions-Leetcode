class Solution {
    public String reverseWords(String s) {
        String res="";
        int i = s.length()-1;
        while(i>= 0){
            while( i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0) break;
            int j=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            String word=s.substring(i+1,j+1);
            if(res!=""){
                res+=" ";
            }
            res+=word;
        }
        return res;
    }
}
