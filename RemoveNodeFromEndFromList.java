/**
 * Created by priyank on 22/2/17.
 */
public class RemoveNodeFromEndFromList {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args){

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        /*head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);*/

        printList(head);
        head = removeNthFromEnd(head, 2);
        printList(head);

    }

    private static void printList(ListNode head){

        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.print("\n");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        int index = length-n;
        temp = head;

        if (index == 0){
            return head.next;
        }
        index--;
        while (index > 0){

            temp = temp.next;
            index--;
        }

            ListNode targetNode = temp.next;
            temp.next = targetNode.next;
            targetNode.next = null;

        return head;
    }
}

