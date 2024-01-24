package LinkedList;

public class CheckPallindrome {
    public class Node{
        int data;
        Node next;  //reference variable
        //constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    //helper function to find mid
    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null||fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //slow is the mid node
    }
    public boolean checkPallindromeInLL(){
        if(head==null||head.next==null){
            return true;
        }
        //find mid
        Node mid = findMidNode(head);

        //reverse 2nd half
        Node curr = mid;
        Node prev = null;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // check right and left halves
        Node right = prev; //last node will become head now
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();
        nums.addFirst(1);
        nums.addFirst(2);
        nums.addFirst(2);
        nums.addFirst(1);
        System.out.println();
    }
    
}
