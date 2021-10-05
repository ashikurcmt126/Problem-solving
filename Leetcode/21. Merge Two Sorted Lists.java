public class Leet_11 {

    static class ListNode{
        ListNode next;
        int data;

        ListNode(int d){
            data = d;
            next = null;
        }
    }

    /*
        Input: l1 = [1,2,4], l2 = [1,3,4]
        Output: [1,1,2,3,4,4]
    */

    public static ListNode mergeTwoLists(ListNode p1, ListNode p2) {
        ListNode start = new ListNode(0);
        ListNode temp = start;

        while (p1 != null && p2 != null){
            if (p1.data < p2.data){
                temp.next = p1;
                p1 = p1.next;
            }else{
                temp.next = p2;
                p2 = p2.next;
            }
            temp = temp.next;
        }
        if(p1 != null){
            temp.next = p1;
        }

        if(p2 != null){
            temp.next = p2;
        }
        return start.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;

        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(3);
        ListNode l7 = new ListNode(4);

        l5.next = l6;
        l6.next = l7;

        ListNode head = mergeTwoLists(l1, l5);
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
