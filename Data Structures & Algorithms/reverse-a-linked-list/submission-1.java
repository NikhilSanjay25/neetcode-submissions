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
    public ListNode reverseList(ListNode head) {
        return rec(null,head);
    }
    public ListNode rec(ListNode prev,ListNode head){
        if(prev==null && head==null){
            return null;
        }
        if(head==null){
            return prev;
        }
        ListNode node = head.next;
        head.next = prev;
        return rec(head,node);
    }
}
