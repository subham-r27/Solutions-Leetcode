class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fiz=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                fiz.add("FizzBuzz");
            }
            else if(i%5==0){
                fiz.add("Buzz");
            }
            else if(i%3==0){
                fiz.add("Fizz");
            }
            else{
                fiz.add(String.valueOf(i));
            }
        }
        return fiz;
    }
}
