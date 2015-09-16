import java.util.LinkedList;

/**
 * Created by Ja on 07/09/2015.
 */

class makeLinkedList {

    LinkedList<Apple> myLinkedList = new LinkedList<Apple>();

    public void addItems() {
        System.out.println();
        myLinkedList.addFirst(new BigApple("BigApple in myLinkedList"));
        myLinkedList.addFirst(new BigApple());

        myLinkedList.addFirst(new SmallApple("SmallApple in myLinkedList"));
        myLinkedList.addFirst(new SmallApple());

        myLinkedList.addFirst(new Apple());

    }

    public LinkedList getmyLinkedList(){

        return myLinkedList;
    }
}


public class LinkedLists {

    makeLinkedList makeLinkedListInstance = new makeLinkedList();

    public void methodsOfLinkedLists() {

        makeLinkedListInstance.addItems();
        makeLinkedListInstance.myLinkedList.getFirst();
        makeLinkedListInstance.myLinkedList.addFirst(new Apple());
        makeLinkedListInstance.myLinkedList.set(2,new BigApple());
        makeLinkedListInstance.myLinkedList.getLast();
        makeLinkedListInstance.myLinkedList.removeLast();


    }

    LinkedLists() {

        methodsOfLinkedLists();
    }


}
