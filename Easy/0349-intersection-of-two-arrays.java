class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();int i=0;
        for(int x : nums1) s1.add(x);
        for(int x: nums2){
            if(s1.contains(x) && !s2.contains(x)) i++;
            s2.add(x);
        }
        int[] arr=new int[i];
        i=0;
        for(int x : s1){
            if(s2.contains(x)){
                arr[i]=x;
                i++;
            } 
        }
        return arr;
    }
}
