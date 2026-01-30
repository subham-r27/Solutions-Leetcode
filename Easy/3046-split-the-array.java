/* class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
           if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            }
            else {
                freq.put(num, 1);
            }
            if (freq.get(num) > 2) {
                return false;
            }
        }
        return true;
    }
}
  */

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count+=1;
                }
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}
