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
        if(head==null || head.next==null){
            return true;
        }
        if(head.next.next==null){
            if(head.val==head.next.val){
                return true;
            }
            return false;
        }
        ListNode slow=head.next;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=reverse(slow);
        fast=head;
        while(slow!=null && fast!=null){
            if(fast.val!=slow.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
        
    }
    public ListNode reverse(ListNode root){
        ListNode prev=null;
        while(root!=null){
            ListNode next=root.next;
            root.next=prev;
            prev=root;
            root=next;
        }
        return prev;

    }
}