package list.newpackage;

public class Node {

    private Object data;
    private Node next;
    
    Node(Object data){
        this.data = data;
    }
    public void setNext(Node nextNode){
        if (nextNode == null) {
            return;
        }
        this.next = nextNode;
    }
    public Node getNext(){
        return next;
    }
    public Object getData() {
        return data;
    }

    public Node delectData() {
        return null;
    }


    
   

    
}
