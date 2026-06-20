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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k<=0) return head;
        int l = length(head);
        k = k%l;
        if(k==0) return head;
        ListNode temp = head;
        for(int i = 1 ; i<l-k ; i++){
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        ListNode tr = newHead;
        while(tr.next!=null){
            tr = tr.next;
        }
        tr.next = head;
        head = newHead;
        return head;
    }
    public int length(ListNode head){
        int c = 0;
        ListNode t = head;
        while(t!=null){
            c++;
            t = t.next;
        }
        return c;
    }
}