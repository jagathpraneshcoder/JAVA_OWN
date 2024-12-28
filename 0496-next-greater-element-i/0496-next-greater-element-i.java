class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int res[] = new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            while(!s.empty() && s.peek()<nums2[i]){
                m.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        } 
        while(!s.empty()){
            m.put( s.pop() , -1 );
        }
        for(int i=0;i<nums1.length;i++){
            res[i]=m.get(nums1[i]);
        }
        return res;
    }
}

/*

Input: nums1[], nums2[]
Output: result[]

Step 1: Initialize an empty stack and an empty HashMap.

Step 2: Traverse nums2:
    For each element num in nums2:
        While stack is not empty AND stack.peek() < num:
            Map stack.pop() -> num in the HashMap.
        Push num onto the stack.

Step 3: For all remaining elements in the stack:
    Map stack.pop() -> -1 in the HashMap.

Step 4: Initialize result[].
    For each element num in nums1:
        result.append(HashMap.get(num)).

Step 5: Return result[].
 */
 