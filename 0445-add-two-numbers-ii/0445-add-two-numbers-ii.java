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
        
        ArrayDeque<Integer> st1=new ArrayDeque<>();
        ArrayDeque<Integer> st2=new ArrayDeque<>();
        while(l1!=null ||l2!=null){
            if(l1!=null){
                st1.push(l1.val);
                l1=l1.next;
            }
            if(l2!=null){
                st2.push(l2.val);
                l2=l2.next;
            }
        }
        ListNode curr=null;
        int c=0;
        while(!st1.isEmpty() || !st2.isEmpty() ||c!=0){
            int val1=!st1.isEmpty()?st1.pop():0;
            int val2=!st2.isEmpty()?st2.pop():0;
            int val=val1+val2+c;
            c=val/10;
            val=val%10;
            curr=new ListNode(val,curr);
        }
        return curr;
    }
}