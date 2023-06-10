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
        
        //find the middle
        ListNode middle = findMiddle(head);

        //reverse second half
        ListNode second = reverse(middle);

        //find pair sum max
        int max = 0;
        while (head != null && second != null) {

            max = Math.max(head.val + second.val, max);
            head = head.next;
            second = second.next;
        }
        return max;
    }

    public ListNode findMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}