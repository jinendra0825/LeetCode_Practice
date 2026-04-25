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
        if(lists == null || lists.length == 0) return null;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i < lists.length ; i++){
            ListNode temp = lists[i];

            while(temp != null){
                pq.offer(temp.val);
                temp = temp.next;
            }

        }

        if(pq.isEmpty()) return null;

        int size = pq.size();
        
       
        ListNode head = new ListNode(pq.poll());
        ListNode temp = head;
        
        while(!pq.isEmpty()){
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }

        return head;

        
    }
}