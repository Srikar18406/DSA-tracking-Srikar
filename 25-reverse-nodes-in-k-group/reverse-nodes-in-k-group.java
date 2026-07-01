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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        int l = 0;
        ListNode temp = head;
        while(temp!=null){
            l++;
            temp = temp.next;
        }
        int grps = l/k;
        ListNode crr = head;
        ListNode prevTail = null;
        while(grps>0){
            ListNode newHead = reverseList(crr,k);
            if(prevTail==null){
                head = newHead;
            }
            else prevTail.next = newHead;                
            prevTail = crr;
            crr = crr.next;
            grps--;
        }
        return head;
    }
    public ListNode reverseList(ListNode head , int k) {
        ListNode prev = null;
        ListNode crr = head;
        while(k!=0){
            ListNode next = crr.next;
            crr.next = prev;
            prev = crr;
            crr = next;
            k--;
        }
        head.next = crr;
        return prev;
    }
}