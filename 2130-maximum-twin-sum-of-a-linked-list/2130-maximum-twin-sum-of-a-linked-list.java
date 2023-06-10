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
      /*  if(head==null) return 0;
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
        return max;*/
        // if(head==null) return 0;
        // if(head.next.next==null) return head.val+head.next.val;
        int sum=0;
        ListNode slow=head,fast=head,curr=head;
          while(fast!=null && fast.next!=null)  {
              slow=slow.next;
              fast=fast.next.next;
          }   
        ListNode head1=reverse(slow);
        while(head1!=null){
             sum=0;
            sum=head1.val+curr.val;
            max=Math.max(max,sum);
            head1=head1.next;
            curr=curr.next;
           
        }
        return max;
    }
    ListNode reverse(ListNode mid_head){
        ListNode curr=mid_head,prev=null;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
}