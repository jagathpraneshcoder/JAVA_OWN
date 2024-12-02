class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        listSub(0,nums.length,nums,myList,l);
        return myList; 
    }
    public static void listSub(int i,int n,int[] nums,List<List<Integer>> myList,List<Integer> l){
        if(i>=n){
            myList.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        listSub(i+1,n,nums,myList,l);
        l.remove(l.size()-1);
        listSub(i+1,n,nums,myList,l);
    }
}