class Solution {
    public int minimumRounds(int[] tasks) {
        //First, we count the occurrences of each integer.
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : tasks){
            //we map each int, to a value representing the # of times it occurs
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int rounds = 0; // Count the number of rounds necessary to complete all tasks.
        for(Integer val : map.values()){
            if(val < 2){ 
                return -1;
            }
            else if(val==2){
                rounds+=1;
            }
            else{
                //The most efficient way to do a task is to do 3 tasks of the same difficulty.
                double res = val/3.0;
                rounds+=Math.ceil(res);
            }
        }
        return rounds;
    }
}
