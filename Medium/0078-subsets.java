class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        int elements=1<<nums.length;
        for(int i =0;i<elements;i++){
            List<Integer> list=new ArrayList<>();
            for(int j =0; j<nums.length;j++){
                if( (i & (1<<j)) != 0) list.add(nums[j]);
            }
            arr.add(list);
        }
        return arr;
    }
}
