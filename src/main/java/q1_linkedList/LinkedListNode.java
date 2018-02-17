package q1_linkedList;

/**
 * Created by Zhaozhe on 16/11/2016.
 */
public class LinkedListNode {
    
    /*
     *  Basic - Constructors
     */

    public LinkedListNode() {

    }

    public LinkedListNode(int value) {
        this.value = value;
    }

    /*
     *  Basic - Properties
     */

    private int value;
    private LinkedListNode nextNode;

    /*
     *  Basic - Getters & Setters
     */

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    /*
     *  Compare - Methods
     */

    public boolean equalsTo(LinkedListNode node) {
        return false;
    }

    /*
     *  Copy - Constructors
     */

    public LinkedListNode(LinkedListNode node) {

    }

    /*
     *  Copy - Methods
     */

    public LinkedListNode copy(){
        return null;
    }
}
