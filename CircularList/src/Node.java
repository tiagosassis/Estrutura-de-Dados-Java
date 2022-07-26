public class Node{
    private int value;
    private Node previous, next;

    public Node(){

    }
    public Node(int value){
        this.value = value;
    }

    // Get and Set
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public Node getPrevious(){
        return this.previous;
    }
    public void setPrevious(Node previous){
        this.previous = previous;
    }
    public Node getNext(){
        return this.next;

    }
    public void setNext(Node next){
        this.next = next;
    }
}