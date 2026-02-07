//Using Boyer Moore Algorithm
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int el1=0,el2=0,c1=0,c2=0;
        for (int num : nums) {
            if (num == el1) {
                c1++;
            } else if (num == el2) {
                c2++;
            } else if (c1 == 0) {
                el1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                el2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1){
                c1++;
            }
            else if(nums[i]==el2){
                c2++;
            }
        }
        if(c1>(nums.length/3)) list.add(el1);
        if(c2>(nums.length/3)) list.add(el2);
        return list;
    }
}


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
