class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev, cur;
        cur = head;
        prev = null;
        while(cur!=null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {

        ListNode slow, fast, prev; 
        slow = fast = prev = head;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next; 
            prev = slow;
            slow = slow.next; 
        }
        if(prev.next==null)
            return;

        prev.next = null;
        ListNode t2 = reverse(slow);
        ListNode t1 = head;

        while(t1.next!=null) {
            ListNode t1n = t1.next;
            ListNode t2n = t2.next;
            t1.next = t2;
            t2.next = t1n;
            t1 = t1n;
            t2 = t2n; 
        }
        if(t2!=null){
            t1.next = t2;
        }
    }
}