class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxpro=0;
        for(int i : prices){
            if(i<minprice) minprice=i;
            else maxpro=Math.max(maxpro,i-minprice);
        }
        return maxpro;
    }
}


/* Brute Solution
class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int diff;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                diff=prices[j]-prices[i];
                pro=Math.max(diff,pro);
            }
        }
        return pro;
    }
}
*/
