public class node {
    public String data;
    public Node next;

    public Node(String data){
        this.data = data;
        this.next = null;
    }
}
public static void main(String[] args) {
    Node obj = new Node();
    obj.Node("I am the First Node.");
    System.out.println(obj.data);
    System.out.println(obj.next);  
}
}
