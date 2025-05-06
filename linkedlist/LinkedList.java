package linkedlist;

 class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data){
        this.data = data;
        this.next = null;

    }
}
// find the length of the linked list
// find the element in the linked list
//traversal of the linked list
// print every element of the linked listd

public class LinkedList{

     private static Node ConvertArr2LinkedList(int []arr){
         Node head = new Node(arr[0]);
         Node mover = head;
         for(int i = 1;i<arr.length;i++){
             Node temp = new Node(arr[i]);
             mover.next = temp;
             mover = temp;
         }
           return head;
     }


    /**
     *
     * @param head this is the head of the linked list
     * @return this will return the length of the linked list by doing counting of it
     */
     private int lengthLinkedList(Node head){
         int count = 0;
         Node temp = head;
         while ((temp!=null)){
             System.out.println(temp.data);
             temp = temp.next;
         }
         return count;

     }

    /**
     *
     *
     * @param head head is the starting point of the linked list
     * @param val we need to check this value exists in the linked list or not
     * @return  this will return the boolean vaue true or false according to the existance of the value in the lineke list.
     */

     private static boolean checkIfPresent(Node head, int val){
         Node temp = head;
         while (temp!=null){
             if(temp.data==val){
                 return true;
             }
             else {
                 temp = temp.next;
             }

         }
         return false;
     }

    /**
     *
     * @param head to remove the head the program is written
     * @return
     */
     public static Node removeHead(Node head){
         if(head==null){
             return head;

         }
         else {
             Node temp = head;
             head = head.next;
             return head;
         }
     }
    /**
     * delete the tail of the linked list
     * this will remove the last node from the linked list
     */
    public static Node removeTail(Node head){
        Node temp = head;

        if(head==null || head.next==null){
            return null;
        }

        while (temp.next.next!=null){
                temp = temp.next;
        }
        temp.next = null;
        return head;


    }

    /**
     *
     * @param head this is to traverse over the linked list
     *             this will directly print the values present in the linked list
     */
     public static void print(Node head){
         Node temp = head;
         while (temp!=null){
             System.out.println(temp.data);
             temp = temp.next;
         }
     }

    /**
     *
     * @param head this is the first Node of the linked list
     * @param k we have to remove the kth element from the linked list
     * @return this will return the head
     */

     public static Node removeKthElement(Node head,int k){
         Node temp = head;
         Node prev = null;
         int count = 0;

         if(head==null){
             return null;
         }
         if(k==1){
             head = head.next;
         }
         else{
         while (temp!=null){
             count++;
             if(count==k){
                 prev.next = prev.next.next;
                 break;
             }
             prev = temp;
             temp = temp.next;

         }}
         return head;

     }


    /**
     *
     * @param head this is the first element of the linked list
     * @param value this is the vlaue given which we have to remove from the list
     * @return we need to return the head of the modified linked list
     */
     public static Node removeValueLL(Node head, int value){
         Node temp = head;
         Node prev = null;

         if(head==null){
             return null;
         }
         if(head.data==value){
             head=head.next;
         }
         else {
             while (temp!=null){
                 if(temp.data==value){
                     prev.next = prev.next.next;
                 }
                 prev = temp;
                 temp = temp.next;

             }


         }
         return head;
     }


    /**
     *
     * Now we will be doing the operation related to insertion in  the linked list
     *
     */

    /**
     *
     * @param head this is the head of the linked list
     * @param val This is the value which we need to insert into the linked list
     * @return this will retun the new head of the linked list
     */
    public static Node insertHead(Node head, int val){
//        Node temp = new Node(val,head);
//        return temp;
        return new Node(val,head);
    }

    /**
     *
     * @param head this is to insert the value in the last of the linked list
     * @param val this value will be inserted in the last
     * @return this will retrnt he head
     * we have to iterate till temp.next is not equal to the null
     *
     */
    public static Node insertTail(Node head, int val){
        if(head==null){
            return new Node(val);
        }

        Node temp = head;
        while (temp.next!=null){

            temp = temp.next;
        }
        if(temp.next==null){
            Node temp2= new Node(val);
            temp.next = temp2;
        }
        return head;
    }

    /**
     *
     * @param head
     * @param val we have to insert this value
     * @param k We have to insert the value at this position
     * @return  this will return a new head
     */

    public static Node insertAtkth(Node head, int val, int k){
 if(head==null) {
     if(k==1){
         return new Node(val);
     }
     else return null;
 }
 if(k==1){
     return new Node(val,head);
 }


    int count  = 0;
    Node temp = head;
    while (temp !=null){
        count++;
        if(count ==k-1){
            Node x = new Node(val);
            x.next = temp.next;
            temp.next = x;
            break;
        }
        temp = temp.next;
    }
    return head;
    }


    public static void main(String[] args) {

        System.out.println(checkIfPresent(new Node(2), 6));
        int[] arr = {2,5,6,8,9,7,4};
        Node head = ConvertArr2LinkedList(arr);

//      System.out.println(head.data)
//      head = removeHead(head);
//      head = removeTail(head);
//      print(head);
//        head = insertTail(head,3);
        head = insertAtkth(head,7,1);
        print(head);
//        print(removeKthElement(head,9));






        /**
         * this is the traversal of the linked list
         *
         */
//        Node temp = head;
//        while ((temp!=null)){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }

    }
}

