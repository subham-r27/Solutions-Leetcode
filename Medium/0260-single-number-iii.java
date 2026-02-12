







//BRUTE
class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        int[] arr = new int[2];int i=0;
        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                arr[i]=entry.getKey();
                i++;
            }
        }
        return arr;
    }
}
