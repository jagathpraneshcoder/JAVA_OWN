class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> myList = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        listSub(0,nums.length,nums,myList,l);
        ans.addAll(myList);
        return ans; 
    }
    public static void listSub(int i,int n,int[] nums,Set<List<Integer>> myList,List<Integer> l){
        if(i>=n){
            System.out.println(l);
            myList.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        listSub(i+1,n,nums,myList,l);
        l.remove(l.size()-1);
        listSub(i+1,n,nums,myList,l);
    }
}