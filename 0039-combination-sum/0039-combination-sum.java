class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> myList = new ArrayList<>();
        backTrack(0,candidates,target,myList,result);
        return result;
    }

    public void backTrack(int start,int[] candidates,int target,List<Integer> myList,List<List<Integer>> result){
        if(target < 0){
            return;
        }
        if(target == 0){
            result.add( new ArrayList<>(myList));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            myList.add(candidates[i]);
            backTrack(i,candidates,target-candidates[i],myList,result);
            myList.remove( myList.size() - 1 );
        }
    }
}