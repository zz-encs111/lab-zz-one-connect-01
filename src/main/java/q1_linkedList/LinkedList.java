package q1_linkedList;

/**
 * Created by Zhaozhe on 16/11/2016.
 */
public class LinkedList {

    /*
     *  Basic - Properties
     */

    private LinkedListNode headNode;

    /*
     *  Level 1 - Methods
     */

    public void buildDemo(){
        LinkedListNode n1 = new LinkedListNode(6);
        headNode = n1;

        LinkedListNode n2 = new LinkedListNode(7);
        n1.setNextNode(n2);

        LinkedListNode n3 = new LinkedListNode(3);
        n2.setNextNode(n3);

        LinkedListNode n4 = new LinkedListNode(8);
        n3.setNextNode(n4);

        LinkedListNode n5 = new LinkedListNode(4);
        n4.setNextNode(n5);
    }

    public String description(){
        return "";
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty(){
        return false;
    }

    /*
     *  Level 2 - Methods
     */

    public int get(int index) {
        return 0;
    }

    public int lastValue() {
        return 0;
    }

    public int indexOf(int value) {
        return 0;
    }

    public boolean contains(int value) {
        return false;
    }

    /*
     *  Level 3 - Methods
     */

    public void add(int value) {

    }

    public void push(int value) {

    }

    public int pop(){
        return 0;
    }

    /*
     *  Level 4 - Methods
     */

    public int remove(int index){
        return 0;
    }

    public void insert(int index, int value) {

    }

    public void replace(int index, int value) {

    }

    /*
     *  Level 5 - Methods
     */

    public LinkedList() {

    }

    public LinkedList(int[] values){

    }

    public LinkedList subList(int fromIndex, int toIndex) {
        return null;
    }

    /*
     *  Level 6 - Methods
     */

    public void remove(int fromIndex, int toIndex){

    }

    public void insert(int fromIndex, LinkedList list) {

    }

    public void replace(int fromIndex, int toIndex, LinkedList list){

    }
}































