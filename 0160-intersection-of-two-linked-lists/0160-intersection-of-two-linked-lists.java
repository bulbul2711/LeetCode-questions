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
    /*  if(head==null || head)
        int c1=0,c2=0;
        ListNode curr1=headA,curr2=headB;
        while(curr1!=null){
            c1++;
            curr1=curr1.next;
        }
         while(curr2!=null){
            c2++;
            curr2=curr2.next;
        }
        int diff=Math.abs(c1-c2);
        if(c1>c2){
            while(diff!=0){
                headA=headA.next;
                diff--;
            }
        }
        else{
            while(diff!=0){
                headB=headB.next;
                diff--;
            }
        }
        while(headA!=null){
            if(headA.next==headB.next)
                return headA.next;
            else{
                headA=headA.next;
                headB=headB.next;
            }
        }
        return null;*/
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
         
         while(headA!=null){
             if(headA==headB)
                 return headA;
             headA=headA.next;
             headB=headB.next;
         }
         return null;
        
    }
}