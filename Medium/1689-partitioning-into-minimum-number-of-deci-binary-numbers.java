class Solution {
    public int minPartitions(String n) {
        int ans =0;
        for(int i =0;i<n.length();i++){
            ans=Math.max(ans,(n.charAt(i)-48)); //ASCII Values - 48 to 57 for numbers
        }
        return ans;
    }
}

// MAX DIGIT WILL HAVE 1s so .. that is the no. deci binary no. required to obtained the sum
