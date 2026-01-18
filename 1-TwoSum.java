class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sol[]=new int[2];
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need = target - nums[i];
            if(map.containsKey(need)){
                sol[0]=map.get(need);
                sol[1]=i;
                return sol;
            }
            map.put(nums[i],i);
        }
        return sol;
        }
        
    }

