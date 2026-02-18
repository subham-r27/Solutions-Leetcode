class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=-1,l=-1;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                f=mid;
                high=mid-1;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        low=0;high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                l=mid;
                low=mid+1;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        int[] arr={f,l};
        return arr;
    }
}



//BRUTE
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=-1,l=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) {
                if(f==-1) f=i;
                l=i;
            }
        }
        int[] arr = {f,l};
        return arr;
    }
}
