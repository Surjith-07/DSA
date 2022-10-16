/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return null;
        ListNode tmp=head;
        List<Integer> list=new ArrayList<>();
        while(tmp!=null){
            list.add(tmp.val);
            tmp=tmp.next;
        }
        int mid=list.size()/2;
        list.remove(mid);
        ListNode ans=new ListNode(list.get(0));
        ListNode temp=ans;
        for(int i=1;i<list.size();++i){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }
        return ans;
    }
}