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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode tmmp=head;
        List<Integer> li=new ArrayList<>();
        while(tmmp!=null){
            li.add(tmmp.val);
            tmmp=tmmp.next;
        }
        int l=li.size();
        int f=li.get(l-k);
        int s=li.get(k-1);
        li.set(k-1,f);
        li.set(l-k,s);
        
        ListNode ans=new ListNode(li.get(0));
        ListNode tmp=ans;
        int i=1;
        while(i<l){
            tmp.next=new ListNode(li.get(i));
            tmp=tmp.next;
            i++;
        }
        return ans;
    }
}