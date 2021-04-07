
import javax.swing.JTextArea;
import javax.swing.JTextField;



class Node{

    int data;
    public Node next;
    public Node prev;
    public Node head;

}

public class append {
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
    Node last;
while(new_node !=null){
        System.out.println(""+new_node.data);
        last= new_node;
        new_node = new_node.next;
    }


}
   
   
}

