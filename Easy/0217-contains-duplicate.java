//OPTIMAL USING SET
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (!set.add(x)) return true;
        }
        return false;
    }
}


//Using Hashmap
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) return true;
            map.put(n, true);
        }
        return false;
    }
}

//-----------OR-------------

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>1) return true;
        }
        return false;
    }
}


/*Brute
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
*/
