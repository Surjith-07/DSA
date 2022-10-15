/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val;this.next=null }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode li1, ListNode li2) {
        List<Integer> f=new ArrayList<>();
        ListNode ans=null;
        while(li1!=null || li2!=null){
            if(li1!=null) {f.add(li1.val); li1=li1.next;}
            if(li2!=null) {f.add(li2.val); li2=li2.next;}
        }
        Collections.sort(f);
        if(f.size()!=0) ans=new ListNode(f.get(0));
        ListNode tmp=ans;
        for(int i=1;i<f.size();++i){
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=new ListNode(f.get(i));
        }
        return ans;
    }
}