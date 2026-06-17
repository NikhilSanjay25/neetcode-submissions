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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p2 = head;
        if(head.next==null){
            return null;
        }
        while(n!=0){
            p2=p2.next;
            n--;
        }
        if(p2 == null){
            return head.next;
        }
        ListNode p1 = head;
        ListNode prev = p1;
        while(p2!=null){
            prev = p1;
            p1=p1.next;
            p2=p2.next;
        }
        
        prev.next = p1.next;
        return head;
    }
}
