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
        if(lists.length==0){
            return null;
        }
        ListNode temp =null;
        for(ListNode a:lists){
            if(a!=null){
                temp=a;
                break;
            }
        }
        if(temp==null){
            return null;
        }
        for(ListNode a:lists){
            if(a==null){
                continue;
            }
            temp = a.val<temp.val ? a:temp;
        }
        ListNode prev = temp;
        while(true){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]==null){
                    continue;
                }
                else if(lists[i].val<min){
                    min = lists[i].val;
                    index = i;
                }
            }
            if(index==-1){
                break;
            }
            ListNode var = lists[index];
            lists[index]=lists[index].next;
            prev.next=var;
            prev=prev.next;
        }
        return temp;
    }
}
