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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp1 = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(temp1!=null){
            ListNode temp = temp1.next;
            temp1.next = prev;
            prev = temp1;
            temp1=temp;
        }
        while(head != null &&prev!=null){
            ListNode temp = head.next;
            ListNode temp2 = prev.next;
            head.next = prev;
            head=head.next;
            head.next = temp;
            head = temp;
            prev = temp2;
        }
    }
}
