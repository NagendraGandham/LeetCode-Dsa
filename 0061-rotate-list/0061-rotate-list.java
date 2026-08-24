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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        int  length=1;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
         k=k%length;
        if(k==0){
            return head;
        }
        temp.next=head;
           System.out.println(length);
       
        temp=head;
        int count=1;
        while(count<length-k && temp.next!=null){
            count++;
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}