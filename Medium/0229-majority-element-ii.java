/* Using HASHMAP
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>(nums.length/3) && !list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
*/


/*Brute
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    c++;
                }
            }
            if(c>(nums.length/3) && !list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
*/
