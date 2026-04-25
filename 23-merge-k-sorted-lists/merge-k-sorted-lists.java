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

        if(lists.length == 0 || lists == null )return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
            );


        for(int i = 0 ; i < lists.length ; i++){
            ListNode temp = lists[i];

            while(temp != null){
                pq.offer(temp);
                temp = temp.next;
            }

        }

        if(pq.isEmpty()) return null;
        
        ListNode head = pq.poll();
        ListNode temp = head;

        while(!pq.isEmpty()){
            ListNode curr = pq.poll();
            temp.next = curr;
            temp = curr;
            temp.next = null;
        }

        return head;

        
    }
}