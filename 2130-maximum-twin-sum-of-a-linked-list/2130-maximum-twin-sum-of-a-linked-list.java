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
    public int pairSum(ListNode head) {
        // ListNode curr=head;
        // ArrayList<Integer> al=new ArrayList<>();
        // while(curr!=null){
        //     al.add(curr.val);
        //     curr=curr.next;
        // }
        // int l=0,r=al.size()-1;
        // int sum=0;
        // int max=Integer.MIN_VALUE;
        // while(l<r){
        //     sum+=al.get(l)+al.get(r);
        //     max=Math.max(sum,max);
        //     sum=0;
        //     l++;
        //     r--;
        // }
        // return max;
        
        Stack<Integer> st=new Stack<>();
        ListNode curr=head;
        int c=0,sum=0;
        int max=Integer.MIN_VALUE;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<c/2;i++){
            st.push(curr.val);
            curr=curr.next;
        }
        while(curr!=null){
            sum+=st.pop()+curr.val;
            max=Math.max(sum,max);
            curr=curr.next;
            sum=0;
        }
        return max;
    }
}