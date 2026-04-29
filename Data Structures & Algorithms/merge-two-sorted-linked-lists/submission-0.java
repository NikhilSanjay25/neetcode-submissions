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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1;
        if(list2==null){
            return list1;
        }
        else{}
        if(list1==null){
            return list2;
        }
        else{}
        if(list1.val<=list2.val){
            p1 = list1;
            list1=list1.next;
        }
        else{
            p1=list2;
            list2=list2.next;
        }
        ListNode ret = p1;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                ListNode temp = list1;
                list1=list1.next;
                p1.next = temp;
                p1=p1.next;
            }
            else{
                ListNode temp = list2;
                list2=list2.next;
                p1.next = temp;
                p1=p1.next;
            }
        }
        while(list1!=null){
            ListNode temp = list1;
            list1=list1.next;
            p1.next = temp;
            p1=p1.next;
        }
        while(list2!=null){
                ListNode temp = list2;
                list2=list2.next;
                p1.next = temp;
                p1=p1.next;

        }
        return ret;
    }
}