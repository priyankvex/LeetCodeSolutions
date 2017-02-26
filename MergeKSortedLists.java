import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by priyank on 26/2/17.
 */
public class MergeKSortedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args){

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(24);
        head1.next.next = new ListNode(6);

        ListNode head = mergeKLists(new ListNode[]{head1});

        printList(head);
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode head = new ListNode(0);
        ListNode tail = head;

        // create priority queue
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(10, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (ListNode listNode : lists){
            while (listNode != null){
                minHeap.add(listNode);
                listNode = listNode.next;
            }
        }

        while (!minHeap.isEmpty()){
            ListNode node = minHeap.poll();
            tail.next = node;
            tail = node;
            tail.next = null;
        }

        return head.next;
    }

    private static void printList(ListNode head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.print("\n");
    }
}

