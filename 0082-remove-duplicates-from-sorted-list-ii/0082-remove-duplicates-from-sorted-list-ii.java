class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=new ListNode(0,head);
        ListNode curr=head;
        ListNode dummy=prev;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                prev.next=curr.next;
            }
            else{
                prev=prev.next;
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}