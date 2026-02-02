class Solution {
    public int missingNumber(int[] nums) {
        int actual=0,expected=0;
        for(int i=1;i<=nums.length;i++){
            expected+=i;
        }
        for(int i=0;i<nums.length;i++){
            actual+=nums[i];
        }
        return (expected-actual);
    }
}

/* Using XOR
class Solution {
    public int missingNumber(int[] nums) {
        int x1=0,x2=0;
        for(int i=1;i<=nums.length;i++){
            x1=x1^i;
        }
        for(int i=0;i<nums.length;i++){
            x2=x2^nums[i];
        }
        return (x1^x2);
    }
}
*/
