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
        ListNode curr=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(curr!=null){
            al.add(curr.val);
            curr=curr.next;
        }
        int l=0,r=al.size()-1;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(l<r){
            sum+=al.get(l)+al.get(r);
            max=Math.max(sum,max);
            sum=0;
            l++;
            r--;
        }
        return max;
    }
}