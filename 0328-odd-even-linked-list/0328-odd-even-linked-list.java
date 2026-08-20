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
    public ListNode oddEvenList(ListNode head) {
        ListNode lastNode=head;
        ListNode firstNode=head;
        if(head==null || head.next==null ||head.next.next ==null ){
            return head;
        }
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        int node=1;
        ListNode prev=null;
        int length=0;
        while(firstNode!=null){
            length++;
            firstNode=firstNode.next;
        }
        firstNode=head;
        while(node<=length){
            if(node%2==0){
                prev.next=firstNode.next;
                lastNode.next=firstNode;
                lastNode=lastNode.next;
                firstNode=firstNode.next;
              
            }
            else{
            prev=firstNode;
            firstNode=firstNode.next;
            }
            node++;
        }
          lastNode.next=null; 
        return head;
    }
}