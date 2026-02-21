class Solution {
    public int findPeakElement(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid+1]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}


/*Brute
class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;
        int low,high;
        for(int i=1;i<nums.length-1;i++){
            low=i-1;high=i+1;
            if(nums[i]>nums[low] && nums[i]>nums[high]){
                return i;
            }
        }
        return 0;
    }
}
*/
