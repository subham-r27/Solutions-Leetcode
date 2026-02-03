class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x=x^nums[i];
        }
        return x;
    }
}





/* Using HashMap
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i], h.get(nums[i]) + 1);
            }
            else{
                h.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
         return -1;
    }
}
*/
