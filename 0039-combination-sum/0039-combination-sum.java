class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> myList = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        findCombination(0,candidates.length,candidates,target,myList,l);
        return myList;
    }
    public void findCombination(int i,int n,int[] candidates,int target,List<List<Integer>> myList,List<Integer> l){
        if(i==candidates.length){
            if(target==0){
                System.out.println(l);
                System.out.println();
                myList.add(new ArrayList<>(l));
            }
            return;
        }
        if(candidates[i]<=target){
            l.add(candidates[i]);
            findCombination(i,n,candidates,target-candidates[i],myList,l);
            l.remove(l.size()-1);
        }
        
        findCombination(i+1,n,candidates,target,myList,l);

    }
}