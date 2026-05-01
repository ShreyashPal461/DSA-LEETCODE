class Solution {
    public ListNode reverseList(ListNode head){
        // reverse krne ke liye 
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next = head;
        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        // middle element 
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode j = reverseList(slow);
        ListNode i = head;
        while(j!=null){
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;
    }
}