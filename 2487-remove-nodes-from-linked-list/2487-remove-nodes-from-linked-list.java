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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode curr=head.next;
        st.push(head.val);
        while(curr!=null){
            while(!st.isEmpty() && st.peek()<curr.val){
                st.pop();
            }
            st.push(curr.val);
            curr=curr.next;
        }
       ListNode a=null;
       while(!st.isEmpty()){
           a=new ListNode(st.pop(),a);
       }
        return a;
    }
}