package linkedlist.doublylinkedlist;
class DLL{
    int data;
    DLL next;
    DLL prev;
    public DLL(int data, DLL next, DLL prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    public DLL(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

public class DoublyLinkedList {
    /**
     *
     * @param arr  this is the array which we need to convert into the doubly linked list
     * @return this will return the head of the doubly linked list
     */
    public static DLL convertArrayToLinkedList(int [] arr){
        DLL head = new DLL(arr[0]);
        DLL prev = head;
        for(int i=1;i<=arr.length-1;i++){
            DLL temp = new DLL(arr[i],null,prev);
            prev.next = temp;
            prev = temp;

        }
        return head;
    }

    /**
     *
     * @param head this is the head of the Doubly linked list
     *             this will print the entire linked list
     */
    public static void print(DLL head){
        DLL temp = head;
        while (temp!=null){
            System.out.print(temp.data+",");
            temp = temp.next;
        }
    }

    /**
     *
     * @param head this is the head of the linked list which is given to us
     * @return this will return the new head of the linked list
     * this will delete the head of the linked list
     */
    public static DLL deleteHead(DLL head){

         DLL temp = head;
        head = head.next;

        temp.next = null;
        head.prev = null;

        return head;

    }


    /**
     *
     * @param head
     * @return wil return the new head with the deleted tail of the linked list
     */
    public static DLL deleteTail(DLL head){
        DLL temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }

        DLL prev = temp.prev;
        prev.next  = null;
        temp.prev = null;

        return head;

    }


    /**
     *
     * @param head
     * @param k we need to delete the kth node
     * @return this will return the modified head of the linked list
     */

    public static DLL deleteKth(DLL head, int k){
        DLL temp = head;
        int count = 0;
        while (temp != null){
            count++;
            if(count==k){
                break;
            }
            temp = temp.next;
        }
        DLL prev = temp.prev;
        DLL front = temp.next;
        if(prev==null && front == null){
            return head;

        }
        if(prev==null){

            return deleteHead(head);
        }
        if(front == null){
            return deleteTail(head);
        }

        prev.next = front;
        front.prev = prev;
        temp.next = null;
        temp.prev = null;


        return head;
    }


    /**
     *
     * @param temp we have to delete the temp node
     * @return there should not be any return type value in this
     * this will delete the given node from the linked list
     */
    public static DLL deleteNode(DLL temp){
        DLL prev = temp.prev;
        DLL next = temp.next;
        if(prev==null && next==null){
            return null;
        }
        if(prev==null){
            return deleteHead(temp);
        }
        if(next==null){
            return deleteTail(temp);
        }
        prev.next = next;
        next.prev = prev;
        temp.prev = null;
        temp.next=null;

        return null;

    }


    /**
     *
     * @param head This is the head of the given linked list
     * @param val this value I have to add in a new node
     * @return we have to return the new head
     */
    public static DLL insertHead(DLL head,int val){
        DLL newHead = new DLL(val,head,null);
        head.prev = newHead;
        return newHead;
    }


    /**
     *
     * @param head this is the head of the linked list
     * @param val this is the value I need to create node of
     * @return we need to return the head with modified linkde list
     */
    public static DLL insertBeforeTail(DLL head,int val){
        DLL temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        DLL prev = temp.prev;

        DLL newNode = new DLL(val);
        prev.next  = newNode;
        newNode.next = temp;
        newNode.prev = prev;
        temp.prev = newNode;

        return head;
    }

    /**
     *
     * @param head This is the given head of the linked list
     * @param val this value we have to isert by creating a node of it
     * @param k this is the position where we have to insert the value
     * @return need to return the modified linked list
     */
    public static DLL insertBeforekth(DLL head, int val, int k){
        int count = 0;
        DLL temp = head;
        while (temp.next!=null){
            count++;
            if(count==k){
                break;
            }
            temp = temp.next;
        }
        if(k==1){
            return insertHead(head,val);
        }
        DLL prev = temp.prev;
        DLL newNode = new DLL(val,temp,prev);
        temp.prev = newNode;
        prev.next = newNode;
        return head;
    }

    /**
     *
     * @param head We have to return the head
     * @param temp We have to insert the new Node before the temp node
     * @param val we need to create the node with this value
     * @return we have to return the head
     */
    public static DLL insertBeforeNode(DLL head, DLL temp, int val){
        DLL prev = temp.prev;

        DLL newNode = new DLL(val,temp,prev);
        prev.next = newNode;
        temp.prev = newNode;

        return head;
    }





    public static void main(String[] args) {
        int []arr  = {2,4,6,1,8};
        DLL head = convertArrayToLinkedList(arr);
////        head = deleteHead(head);
//        head = deleteKth(head,5);
//        head = insertHead(head,10);
//        head = insertBeforeTail(head,9);
        head = insertBeforekth(head,20,1);


        print(head);

    }

}
