/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      //  ListNode tempA=headA.tempB=headB;
        int c1=0,c2=0;
        if(headA==null || headB==null)
             return null;
        for(ListNode curr=headA;curr!=null;curr=curr.next)
            c1++;
         for(ListNode curr=headB;curr!=null;curr=curr.next)
            c2++;
       int count=Math.abs(c2-c1);
        while(count!=0){
            if(c1>c2)
                headA=headA.next;
            else
                headB=headB.next;
            count--;
        }
         
         while(headA!=null && headB!=null){
             if(headA==headB)
                 return headA;
             headA=headA.next;
             headB=headB.next;
         }
         return null;
        
      
    }
}