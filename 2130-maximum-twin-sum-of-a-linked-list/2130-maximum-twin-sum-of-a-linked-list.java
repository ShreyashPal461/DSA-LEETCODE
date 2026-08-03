class Solution {
    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next = head;
        while(curr!=null){
            Next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast  = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode j = reverseList(slow);
        ListNode i = head;
        int max =0;
        while(j!=null){
            int sum = i.val + j.val;
            if(sum>max) max = sum;
            i = i.next;
            j= j.next;
        }
        return max;
    }
}