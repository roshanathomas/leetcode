package leetcode.learning.twopointer;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class FindMiddleElementInLinkedList {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public boolean hasCycle(ListNode head) {
    
    ListNode slow = head, fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;          // 1 step
        fast = fast.next.next;     // 2 steps
        if (slow == fast) return true;
    }
    return false;
        
    }

    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ListNode entry = head;

                while(entry !=slow){
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }

        return null;

    }

    public ListNode removeNthFromEnd(ListNode head,int n) {

        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i = 0 ;i<=n;i++) {
            fast = fast.next;
        }

        while(fast !=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;


    }

    static ListNode build(int... vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        FindMiddleElementInLinkedList solver = new FindMiddleElementInLinkedList();
        ListNode head = build(1, 2, 3, 4, 5);
        ListNode mid = solver.middleNode(head);
        System.out.println(mid.val);

        // Build 3 -> 2 -> 0 -> -4 and connect tail to node with value 2
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // cycle here

        ListNode head1 = n1;       // head of the list
        ListNode cycleHead = n2;  // start of the cycle

        System.out.println(solver.hasCycle(cycleHead));

        ListNode cycleEntry = solver.detectCycle(cycleHead);
        System.out.println(cycleEntry.val);

    }

}
