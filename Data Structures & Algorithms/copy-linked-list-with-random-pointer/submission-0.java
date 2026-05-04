/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        HashMap<Node,Node> op = new HashMap<>();

        Node ret = new Node(head.val);
        Node temp = ret;
        Node temp2 = head;
        op.put(head,ret);
        head = head.next;
        while(head!=null){
            ret.next = new Node(head.val);
            ret=ret.next;
            op.put(head,ret);
            head = head.next;
        }
        head = temp2;
        ret = temp;
        while(head!=null){
            ret.random = op.get(head.random);
            ret=ret.next;
            head = head.next;
        }
        return temp;

    }
}
