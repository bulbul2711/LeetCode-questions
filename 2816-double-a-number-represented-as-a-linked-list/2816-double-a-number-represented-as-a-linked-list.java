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
    public ListNode doubleIt(ListNode head) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        ListNode curr=head;
        while(curr!=null){
            st.add(curr.val);
            curr=curr.next;
        }
        ListNode a=null;
        int x=0;
        while(!st.isEmpty()){
            int y=st.removeLast();
            a=new ListNode((y*2)%10+x,a);
            x=(y*2)/10;
        }
        if(x>0)
            a=new ListNode(x,a);
        return a;
    }
}