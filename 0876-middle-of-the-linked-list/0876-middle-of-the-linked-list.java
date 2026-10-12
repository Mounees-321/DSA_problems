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
    public ListNode middleNode(ListNode head) {
        ListNode sl = head;
        ListNode fs = head;
        while(fs!=null &&  fs.next!=null)
        {
            sl = sl.next;
            fs = fs.next.next;
        }
        return sl;
    }
}