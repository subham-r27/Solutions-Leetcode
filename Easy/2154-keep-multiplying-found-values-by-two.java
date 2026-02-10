//Using List
class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> list=new ArrayList<>();
        for(int x : nums) list.add(x);
        while(list.contains(original)){
            original*=2;
        }
        return original;
    }
}
