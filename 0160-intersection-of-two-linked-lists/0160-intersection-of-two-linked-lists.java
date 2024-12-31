/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public int length(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = length(headA);
        int lengthB = length(headB);
        while(lengthA>lengthB){
            headA=headA.next;
            lengthA--;
        }
        while(lengthB>lengthA){
            headB=headB.next;
            lengthB--;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        if(headA==headB) return headA;
        else return null;
    }
}