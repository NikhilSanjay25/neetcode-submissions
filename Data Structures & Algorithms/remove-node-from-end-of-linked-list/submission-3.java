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
        if(head.next==null ){
            return head.next;
        }
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int val = len-n ;
        ListNode prev = null;
        ListNode curr = head;
        if(len == n){
            return head.next;
        }
        while(val!=0){
            prev = curr;
            curr=curr.next;
            val--;
        }
        prev.next=curr.next;
        return head;
    }
}
