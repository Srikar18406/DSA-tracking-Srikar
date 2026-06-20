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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        if(f!=null) s = s.next;
        ListNode p = null;
        while(s!=null){
            ListNode t = s.next;
            s.next = p;
            p = s;
            s = t;
        }
        ListNode r = head;
        while(p!=null){
            if(r.val!=p.val) return false;
            p = p.next;
            r = r.next;
        }
        return true;
    }
}