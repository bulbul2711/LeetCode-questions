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
        int max=Integer.MIN_VALUE;
        if(head==null) return 0;
        if(head.next.next==null) return head.val+head.next.val;
        else{
        ListNode curr=head;
        ArrayList<Integer> al =new ArrayList<>();
        while(curr!=null){
            al.add(curr.val);
            curr=curr.next;
        }
        int n=al.size();int sum=0;
        
        for(int i=0;i<n/2;i++){
            sum+=al.get(i)+al.get(n-i-1);
            max=Math.max(max,sum);
            sum=0;
        }
        }
        return max;
    }
}