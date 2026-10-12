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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int no_n = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            no_n++;
            temp = temp.next;
        }

        int k = no_n-n;
        if(k==0)
            return head.next;
        else
        {
            ListNode cur = head;
            while(k-1>0)
            {
                cur = cur.next;
                k--;
            }
            cur.next = cur.next.next;
            return head;
        }
    }
}