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
    public ListNode removeNthFromEnd(ListNode head, int s) {
    if(head.next==null){
        return null;
    }
    if(s==1){
        ListNode temp=head;
        ListNode prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        return head;
       } 
       int length=1;
       
       ListNode temp=head;
       while(temp.next!=null){
        length++;
        temp=temp.next;
       }
       if(length==s){
        head=head.next;
        return head;
       }
       int n=length-s+1;
       temp=head;
       ListNode prev=null;
       while(temp!=null){
            if(--n==0){
                break;
            }
            prev=temp;
            temp=temp.next;
       }
       prev.next=temp.next;
       return head;
    }
}