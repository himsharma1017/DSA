import java.util.*;
public class linkedList {

    public class Node {

        public String data;
        private Node next;
      
        public Node(String data) {
          this.data = data;
          this.next = null;
        }
      
        public void setNextNode(Node node) {
          this.next = node;
        }
      
        public Node getNextNode() {
          return this.next;
        }      
      }

    public static void LinkedList(){
        public Node head;

        public LinkedList(){
            this.head = null;
        }
      }

    public void addToHead(String data){
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;

        if(currentHead!=null)
            this.head.setNextNode(currentHead);
    }

    public void addToTail(String data){
        Node tail = this.head;
      
        if(tail==null)
          this.head = new Node(data);
        else
          while(tail.getNextNode()!=null)
            tail = tail.getNextNode();
        
        tail.setNextNode(new Node(data));
        }

        public String removeHead(){
            Node removedHead = this.head;
            if(removedHead==null)
              return null;
        
          this.head = removedHead.getNextNode();
          return removedHead.data;
          }

          public String printList(){
            String output = "<head> ";
            Node currentNode = this.head;
        
            while(currentNode!=null)
              output += currentNode.data + " ";
              currentNode = currentNode.getNextNode();
            
            output = "<tail> ";
            return output;
          }
    public static void main(String[] args) {
        
    }
}
