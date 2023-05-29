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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int c=0;
        while(l1!=null || l2!=null || c!=0){
            int val1=l1!=null?l1.val:0;
            int val2=l2!=null?l2.val:0;
            int val=val1+val2+c; 
            c=val/10;
            val=val%10;
            curr.next= new ListNode(val);
            curr=curr.next;
            
            if(l1!=null) 
                l1=l1.next;
            else 
                l1=null;
            if(l2!=null) 
                l2=l2.next;
            else 
                l2=null;
        }
        return dummy.next;
    }
}