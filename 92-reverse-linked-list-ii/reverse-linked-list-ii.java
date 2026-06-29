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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode dumm = new ListNode(0);
        dumm.next = head;
        ListNode prev = dumm;
        ListNode temp = head;
        int l = 1;
        while(l!=left){
            l++;
            temp = temp.next;
            prev = prev.next;
        }
        ListNode ln = temp;
        ListNode p = null;
        while(l!=right+1){
            ListNode next = temp.next;
            temp.next = p;
            p = temp;
            temp = next;
            l++;
        }
        ln.next = temp;
        prev.next = p;
        return dumm.next;

    }
}