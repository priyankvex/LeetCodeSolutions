/**
 * Created by priyank on 19/2/17.
 */
public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args){


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode tail = head;

        int carry = 0;

        while (l1 != null && l2 != null){

            int sum = l1.val + l2.val + carry;
            carry = sum/10;
            int place = sum%10;

            ListNode temp = new ListNode(place);
            tail.next = temp;
            tail = temp;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null){
            int sum = l1.val + carry;
            carry = sum/10;
            int place = sum%10;
            ListNode temp = new ListNode(place);
            tail.next = temp;
            tail = temp;
            l1 = l1.next;
        }

        while (l2 != null){
            int sum = l2.val + carry;
            carry = sum/10;
            int place = sum%10;
            ListNode temp = new ListNode(place);
            tail.next = temp;
            tail = temp;
            l2 = l2.next;
        }

        if (carry != 0){
            ListNode temp = new ListNode(carry);
            tail.next = temp;
        }

        return head.next;
    }
}

