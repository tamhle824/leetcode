/* linear data structure with colleciton of multiple nodes.
each element stores its own data and a pointer to the location of the next element. Last linked
lost points to null(end of chain)

3 types: 
singly linked list(unidirectional)
doubly linked list
circular linked list


*/

public class LinkedListEx {
    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;

        }
    }
    // Method to insert a new node
    public static LinkedListEx insert(LinkedListEx list, int data){

        //create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If linked list is emtpy
        // makde a new node as head
        if(list.head == null){
            list.head = new_node;
        }else{
            Node last = list.head;
            while(last.next!= null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinedListEx list){
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        
    }
}
