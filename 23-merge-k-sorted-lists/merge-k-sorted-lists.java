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
        return helper(lists,0,lists.length - 1);
    }
    public ListNode helper(ListNode []arr , int l , int r){
        if(l>r) return null;
        if(l==r) return arr[l];
        int mid = l + (r-l)/2;
        if(arr.length == 1) return arr[0];
        ListNode lList = helper(arr , l , mid);
        ListNode rList = helper(arr,mid+1 , r);
        return mergeTwoLists(lList , rList);
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