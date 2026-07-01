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
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        ListNode res = lists[0];
        for(int i = 1 ; i<lists.length ; i++){
            res = mergeTwoLists(res , lists[i]);
        }
        return res;

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2 == null)return list1;
        if(list1.val<=list2.val){
            list1.next = mergeTwoLists(list1.next , list2);
            return list1;
        }
        else {
            list2.next = mergeTwoLists(list2.next , list1);
            return list2;
        }
    }
}