import javax.swing.JOptionPane;

public class DoublyLinkedList {
    private int size;
    private Node head, tail, cursor;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return this.tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }
    public void addLast(int value){
        Node newNode = new Node(value);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.setPrevious(newNode);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }
    public void remove(int value){
        Node cursorAux;
        cursor = head;
        for(int i = 0; i < size; i++){
            if(cursor.getValue() == value){
                if(i == 0){
                    advance();
                    this.head = cursor;
                    break;
                }
                else if(i == (size-1)){
                    cursor = cursor.getPrevious();
                    this.tail = cursor;
                    break;
                }
                else{
                    cursorAux = cursor.getPrevious();
                    advance();
                    cursor.setPrevious(cursorAux);
                    cursorAux.setNext(cursor);
                    break;
                }
            }
            advance();
        }
        size--;
        System.out.println(value + " has been removed.");
    }
    public int search(int value){
        cursor = head;
        for(int i = 0; i < size; i++){
            if(cursor.getValue() == value){
                System.out.println("Value " + value + " found.");
                return i;
            }
            advance();
        }
        System.out.println("Value " + value + " not found.");
        return -1;
    }
    public boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;
    }
    @Override
    public String toString(){
        cursor = head;
        for(int i = 0; i < size; i++){
            if(i == 0)
                System.out.println("head : " + cursor.getValue());
            else{
                if((i == (size - 1))){
                    System.out.println("tail : " + cursor.getValue());
                    return "";
                }
                System.out.println("value: " + cursor.getValue());
            }
            advance();
        }
        return "";
    }
    private void advance() throws NullPointerException{
        if(!(cursor.getNext() == null))
            cursor = cursor.getNext();
    }

}
