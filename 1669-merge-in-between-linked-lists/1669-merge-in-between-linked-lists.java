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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr=list1,curr1=list2;
        ListNode start=null,end=null;int c=0;
        while(c!=a-1){
            curr=curr.next;
            c++;
        }
        start=curr;
        while(c!=b+1){
            curr=curr.next;
            c++;
        }
        end=curr;
        while(curr1.next!=null){
            curr1=curr1.next;
        }
        start.next=list2;
        curr1.next=end;
        return list1;
    }
}