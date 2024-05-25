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
    public ListNode deleteDuplicates(ListNode head) {
       DFs(head);
       return head ;
    }
    public void DFs(ListNode head ){
        if(head==null || head.next==null) return  ;
        if(head.val== head.next.val){
            head.next = head.next.next ;
             DFs(head);
        }else {
            DFs(head.next);
        }
        
    }
}