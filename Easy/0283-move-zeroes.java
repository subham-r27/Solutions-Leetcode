class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return;
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }


        /*
        int[] temp = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
        */


        /*
        if(nums.length > 1){
        int j;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i+1;
                while(j<nums.length && nums[j]==0){
                    j++;
                }
                if(j == nums.length) break;
                nums[i]=nums[j];
                nums[j]=0;
            }
        }
        }
        */
    }
}
