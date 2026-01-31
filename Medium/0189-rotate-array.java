/*
Brute
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1) return;
        k = k % nums.length;
        k=k % nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<(nums.length-k);i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<k;i++){
            nums[i]=nums[nums.length-k+i];
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=arr.get(i-k);
        }
    }
}
*/

class Solution {
    public void rotate(int[] nums, int k) {
        k=k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int arr[],int start, int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
