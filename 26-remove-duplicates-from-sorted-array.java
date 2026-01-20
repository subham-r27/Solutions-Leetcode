class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return (i+1);
          }
}
/* Brute Solution :
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> st = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int index=0;
        for(int x : st){
            nums[index]=x;
            index++;
        }
        return index;
    }
}
*/

