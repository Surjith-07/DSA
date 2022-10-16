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
        if(head==null) return null;
        ListNode tmp=head;
        List<Integer> li=new ArrayList<>();
        while(tmp!=null){
            li.add(tmp.val);
            tmp=tmp.next;
        }
        ListNode ans=new ListNode(li.get(li.size()/2));
        ListNode temp=ans;
        int i=li.size()/2 + 1,l=li.size();
        while(i<l){
            temp.next=new ListNode(li.get(i));
            temp=temp.next;
            i++;
        }
        return ans;
    }
}