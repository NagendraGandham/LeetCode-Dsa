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
    public ListNode reverseList(ListNode head) {
        head=reverse(null,head);
        return head;
    }

    public ListNode reverse(ListNode prev,ListNode current){
        if(current==null){
            return prev;
        }
        ListNode next=current.next;
        current.next=prev;
        prev=current;
        current=next;

        return reverse(prev,current);
    }
}