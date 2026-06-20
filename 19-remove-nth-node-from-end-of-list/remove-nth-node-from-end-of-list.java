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
        if(head==null) return head;
        int l = length(head);
        n = l - n;
        if(n==0) return head.next;
        ListNode temp = head;
        int c = 0;
        while(temp!=null && c<n-1){
            temp = temp.next;
            c++;
        }
        if(temp==null || temp.next==null) return head;
        ListNode delNode = temp.next;
        temp.next = delNode.next;
        delNode.next = null;
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