package com.company;
import java.util.Random;
import java.util.Scanner;



public class DoublyLinkedList {

static class Node{

    private int data;
    public Node next;
    public Node prev;

}
static void insertAfter(Node head, int new_data, int node_value){
    if(head==null){
        System.out.println("the given previous node cannot be NULL");
        return;
    }
    Node new_node = new Node();
    new_node.data=new_data;

    while(head.data !=node_value){
        head=head.next;
    }
    new_node.next=head.next;
    head.next=new_node;
    new_node.prev=head;

    if (new_node.next !=null){
        new_node.next.prev= new_node;
    }


}

    public static Node append(Node headref, int new_data){

    Node new_node = new Node();
    Node last = headref;

    new_node.data=new_data;
    new_node.next=null;

    if (headref==null){
        new_node.prev=null;
        headref=new_node;
        return headref;
    }
    while(last.next !=null){
        last=last.next;
    }
    last.next=new_node;
    new_node.prev=last;
    return new_node;
    }
    static void printList(Node node){
    Node last;
    System.out.println("\nTraversal in forward direction \n");
    while(node !=null){
        System.out.println(""+node.data);
        last= node;
        node = node.next;
    }

    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

    Node head =null;
    int n;
    System.out.println("enter the size of linked list:");
    n = myObj.nextInt();
    Random rnd = new Random();
    int i;
    for(i=0;i<n;i++){
        if(head == null){
           head = append(head,rnd.nextInt(20) );
        }else{
            append(head,rnd.nextInt(20) );
        }
        
    }
    System.out.println("Created dll is:");
    printList(head);
    System.out.println("Enter new node value:");
    int temp = myObj.nextInt();
    System.out.println(("Enter the node value after which..:"));
    int insert_node_after_value= myObj.nextInt();
    insertAfter(head,temp,insert_node_after_value);
    System.out.println("New DLL is");
    printList(head);
    return;




    }


}

