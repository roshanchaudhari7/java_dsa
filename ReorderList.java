
        // 143. Reorder List 

public class ReorderList {

    public static ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    } 
    public static ListNode reverseList(ListNode head) {
        ListNode prev, curr, next;
        curr = head;
        prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode first = head;
        ListNode second = reverseList(mid);

        while(second.next != null){
            ListNode temp = first.next;
            first.next = second;
            first = temp;
            temp = second.next;
            second.next = first;
            second = temp;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
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
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        reorderList(a);
        System.err.print("Reorder List is : ");
        display(a);
    }
}
