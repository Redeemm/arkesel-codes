import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the linked list:");
        int n = sc.nextInt();

        System.out.println("Enter the values of the nodes in the linked list:");
        ListNode head = null;
        ListNode tail = null;
        for (int i = 0; i < n; i++) {
            System.out.print("node "+ i +" -> ");
            int val = sc.nextInt();
            if (head == null) {
                head = new ListNode(val);
                tail = head;
            } else {
                tail.next = new ListNode(val);
                tail = tail.next;
            }
        }

        System.out.println("The linked list is:");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");

        boolean hasCycle = hasCycle(head);
        System.out.println("Linked list has a cycle: " + hasCycle);
    }
}
