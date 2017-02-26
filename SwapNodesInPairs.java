/*
Created by priyank on 26/2/17.
 */
public class SwapNodesInPairs {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args){

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode head = swapPairs(head1);

        printList(head);
    }

    private static ListNode swapPairs(ListNode head) {
        ListNode temp = head;

        while (temp != null && temp.next != null){
            int holder = temp.val;
            temp.val = temp.next.val;
            temp.next.val = holder;
            temp = temp.next.next;
        }

        return head;
    }

    private static void printList(ListNode head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.print("\n");
    }
}

