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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        if(lists.length==1)
            return lists[0];
       
           List<ListNode> al=new ArrayList<>();
            for(int i=0;i<lists.length;i+=2){
                ListNode l2=i+1<lists.length?lists[i+1]:null;
                al.add(merge(lists[i],l2));
            }
       return mergeKLists(al.toArray(new ListNode[0]));
          
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next=l1;
                l1=l1.next;
            }
            else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=l1!=null?l1:l2;
        return dummy.next;
    }
}