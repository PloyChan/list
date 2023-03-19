package list.newpackage;

public class MyList {
    private Node cursor;
    private int size = 0;
    private Node head;
    
    public void add(Object data){
       if(head == null){
           head = new Node(data);
           size++;
       } else{
           cursor = head;
           while(cursor.getNext()!= null){
               cursor = cursor.getNext();
           }
           cursor.setNext(new Node(data));
           size++;
       }
    }
    
    public Object delect(int index){
        this.cursor = this.head;
        
        return null;
    }
    public Object get(int index){
        this.cursor = this.head;
        
        for(int i = 0; i < index; i++){
            if(i == index){
                return this.cursor.getData();
                //printIndex(index);
            }else{
                this.cursor = this.cursor.getNext();
            }
        }
        return this.cursor.getData(); 
    }
     public void printIndex(int index) {
        System.out.print("["+get(index)+"]");
    }
    public int getSize(){
        return size;
    }
      public void printDebug() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(get(i));
            System.out.print(", ");
        }
        System.out.println("]");
    }
      
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result = result + get(i)+", ";
        }
        result = result + "]";
        return result;
    }

 
}
