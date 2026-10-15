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
    public ListNode reverseList(ListNode head) {
        List<Integer> vals= new ArrayList<>();

        for(ListNode n = head; n != null; n = n.next){
            vals.add(n.val);
        }

    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;

        for(int i = vals.size()-1 ; i>=0 ; i--){
        tail.next = new ListNode(vals.get(i));
        tail = tail.next;
        }
        return dummy.next;
    }
}
