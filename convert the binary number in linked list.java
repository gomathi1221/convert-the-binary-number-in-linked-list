class Solution {
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }
        
        int k=0;
        ListNode curr=head;
        while(curr!=null){
        k=k*2+curr.val;
        curr=curr.next;
        }
        return k;
    }
    
}