// TC- N^2 , SC - 1
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        for(int i=0;i<nums.length-2;i+=2){
            for(int j=i+2;j<nums.length;j=j+2){
                if(nums[j]<nums[i]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        for(int i=1;i<nums.length-2;i+=2){
            for(int j=i+2;j<nums.length;j=j+2){
                if(nums[j]>nums[i]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        return nums;
    }
}


//TC- N Log N , SC - N
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
       
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        
       
        Collections.sort(even);   
        Collections.sort(odd, Collections.reverseOrder());
      
        int e = 0, o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(e++);
            } else {
                nums[i] = odd.get(o++);
            }
        }
        
        return nums;
    }
}
