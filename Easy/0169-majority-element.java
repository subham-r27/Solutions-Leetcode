class Solution {
    public int majorityElement(int[] nums) {
        int el=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                c=1;
                el=nums[i];
            }
            else if(el==nums[i]){
                c++;
            }
            else{
                c--;
            }
        }
        int c1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) {
                c1++;
            }
        }
        if (c1 > (nums.length / 2)) return el;
        return -1;
    }
}





/* HashMap
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>(nums.length/2)) return entry.getKey();
        }
        return -1;
    }
}
*/


/* Brute Solution
class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]) c++;
            }
            if(c>(nums.length/2)) return nums[i];
        }
        return -1;
    }
}
*/
