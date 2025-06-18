class ListNode{
    int val;
    ListNode next;

    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}

class Solution{
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode current = head;
        while (current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println(); // Newline after list
    }
}



public class remove_dup_ll {
    public static void main(String[] args){

        ListNode head = new ListNode(1,new ListNode(2,new ListNode(2, new ListNode(3,null))));

        Solution sol = new Solution();
        ListNode result =  sol.deleteDuplicates(head);
        sol.printList(result);
    }

}
