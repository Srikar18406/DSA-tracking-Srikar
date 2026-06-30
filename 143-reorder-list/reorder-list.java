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
        if(head.next==null || head==null) return;
        ListNode s = head;
        ListNode f =head;
        while(f.next!=null && f.next.next!=null){
            s = s.next;
            f = f.next.next;
        }
        ListNode popList = s.next;
        s.next = null;
        Stack<ListNode> stack = new Stack<>();
        while(popList != null){
            stack.push(popList);
            popList = popList.next;
        }
        ListNode crr = head;
        while(!stack.isEmpty()){
            ListNode next = crr.next;
            ListNode pop = stack.pop();
            crr.next = pop;
            pop.next = next;
            crr = next;
        }
    }
}