
package list;

import list.newpackage.MyList;

public class NewClass {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        //myList.printDebug();
        myList.get(2);
        System.out.println(myList);
        
      
    }

}
