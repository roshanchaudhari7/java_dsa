
//      1669. Merge In Between Linked Lists

public class MergeInBetweenLinkedLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = null;
        ListNode end = list1;
        for (int i = 0; i <= b; i++) {
            if (i == a - 1) {
                start = end;
            }
            end = end.next;
        }
        start.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = end;
        return list1;
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(13);
        ListNode d = new ListNode(6);
        ListNode e = new ListNode(9);
        ListNode f = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        int p = 3;
        int q = 4;
        ListNode x = new ListNode(1000000);
        ListNode y = new ListNode(1000001);
        ListNode z = new ListNode(1000002);
        x.next = y;
        y.next = z;
        ListNode m = mergeInBetween(a, p, q, x);
        display(m);

    }
}
