package implementationfolder;


class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }

    public Node() {
    }

    /**
     * Convert Array to Linked List
     */

    Node convertArrayToLinkedList(int []arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover  = mover.next;
        }
        return head;
    }

    /**
     *
     * @param head this is the starting point of the Linked List
     */
    void printLinkedList(Node head){
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    /**
     * Reverse a Linked List
     */
    Node reverseLinkedList(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr!=null){
            next = curr.next;;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    /**
     *
     * @param head this is the head
     * @return  return if the given linked list is circular or not
     */

    boolean checkCircular(Node head){
        Node slow = head;
        Node fast = head;
        while (slow.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }

        return false;
    }

    /**
     * find the point where the linked list form circularity
     */

    Node findCircular(Node head){

        Node slow = head;
        Node fast = head;
        while (slow.next!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
               fast = head;
               while (slow!=fast){
                   slow = slow.next;
                   fast = fast.next;

               }

               return slow;
            }
        }

        return null;

    }
}

class SinglyLinkedList {

    public static void main(String[] args) {

        int[]arr  = {1,2,3,4,5,6,7};
        Node node = new Node();
        Node head = node.convertArrayToLinkedList(arr);
        Node revHead = node.reverseLinkedList(head);
        node.printLinkedList(revHead);
    }


}

