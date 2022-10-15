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
        ListNode tmmp=head;
        List<Integer> list=new ArrayList<>();
        while(tmmp!=null){
            list.add(tmmp.val);
            tmmp=tmmp.next;
        }
        list.remove(list.size()-n);
        if(list.isEmpty()) return null;
        ListNode ans=new ListNode(list.get(0));
        ListNode tmp=ans;
        int i=1,l=list.size();
        while(i<l){
            tmp.next=new ListNode(list.get(i));
            tmp=tmp.next;
            i++;
        }
        return ans;
    }
}