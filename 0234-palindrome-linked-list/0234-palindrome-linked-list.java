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
        if (head == null || head.next == null) 
        {
            return true;
        }
        ListNode s = new ListNode();
        ListNode f = new ListNode();
        s=head;
        f=head;
        while(f.next!=null && f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        ListNode nhead=revSecHalf(s.next);
        ListNode first=head;
        ListNode second=nhead;
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
        
    }
    public ListNode revSecHalf(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode nhead=revSecHalf(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return nhead;
    }
}