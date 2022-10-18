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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null) return null;
        List<Integer> li=new ArrayList<>();
        for(ListNode k:lists){
            ListNode tmp=k;
            while(tmp!=null){
                li.add(tmp.val);
                tmp=tmp.next;
            }
        }
        Collections.sort(li);
        if(li.isEmpty()) return null;
        ListNode ans=new ListNode(li.get(0));
        ListNode temp=ans;
        int i=1;
        while(i<li.size()){
            temp.next=new ListNode(li.get(i));
            temp=temp.next;
            i++;
        }
        return ans;
    }
}