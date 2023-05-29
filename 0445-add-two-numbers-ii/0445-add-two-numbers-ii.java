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
        
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        Stack<Integer> st3=new Stack<>();
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
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int c=0;
        while(!st1.isEmpty() || !st2.isEmpty() ||c!=0){
            int val1=!st1.isEmpty()?st1.pop():0;
            int val2=!st2.isEmpty()?st2.pop():0;
            int val=val1+val2+c;
            c=val/10;
            val=val%10;
            st3.push(val);   
        }
        while(!st3.isEmpty()){
            curr.next=new ListNode(st3.pop());
            curr=curr.next;
        }
        return dummy.next;
    }
}