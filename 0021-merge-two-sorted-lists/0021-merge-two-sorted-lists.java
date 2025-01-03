/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode head1,head2,temp1,t1=null;
        head1=list1;head2=list2;
        temp1=new ListNode(0);
        t1=temp1;
        while(head1!=null && head2!=null){
            if(head1.val > head2.val){
                t1.next=new ListNode(head2.val);
                t1=t1.next;
                head2=head2.next;
            }

            else if(head1.val < head2.val){
                t1.next=new ListNode(head1.val);
                t1=t1.next;
                head1=head1.next;
            }
            else{
                t1.next=new ListNode(head1.val);
                t1=t1.next;
                t1.next=new ListNode(head2.val);
                t1=t1.next;
                head1=head1.next;
                head2=head2.next;

            }
        }
        while(head1!=null){
            t1.next=new ListNode(head1.val);
            t1=t1.next;
            head1=head1.next;
        }
        while(head2!=null){
            t1.next=new ListNode(head2.val);
            t1=t1.next;
            head2=head2.next;
        }

        return temp1.next;
    }
}