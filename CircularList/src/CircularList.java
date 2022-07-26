public class CircularList{
    private Node cursor;
    private int size;

    public CircularList(){
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }
    public void add(int value){
        Node newNode = new Node(value);
        if(size == 0){
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
            cursor = newNode;
        }
        else{
            newNode.setNext(cursor.getNext());
            newNode.setPrevious(cursor);
            cursor.setNext(newNode);
            advance(2);
            cursor.setPrevious(newNode);
            regress();
        }
        size++;

    }
    public void remove(){

    }
    public int search(int value){
        if(this.isEmpty()){ // verifica se a lista está vazia, se estiver, diz ao usuário e encerra a execução do método
            System.out.println("The list is empty.");
            return 0;
        }
        for(int i = 0; i < size; i++){
            if(value == cursor.getValue()){
                System.out.println(value + " was found in the " + i + "th position.");
                advance(size - i); // passando o deslocamento do cursor para que a função advance retorne ele ao "inicio" da lista e mantenha ela em ordem
                return i; // retorna o "indice" do value, este que será usado para a função de remoção
            }
            advance(1);
        }
        System.out.println("Value isn't found.");
        return 0;
    }
    public void showAll(){
        if(this.isEmpty()){ // verifica se a lista está vazia, se estiver, diz ao usuário e encerra a execução do método
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("\n"); // espaçamento
        for(int i = 0; i < size; i++){
            advance(1);
            System.out.println("Value:" + cursor.getValue());
        }
    }
    public void advance(int k){ // avança o cursor em uma posição na lista
        // recebe como parâmetro o valor que precisa ser deslocado na lista
        for(int i = 0; i < k; i++){
            cursor = cursor.getNext();
        }
    }
    public void regress(){ // retrocede o cursor em uma posição na lista
        cursor = cursor.getPrevious();
    }
    public boolean isEmpty(){ // retorna true ou false para a lista estar vazia ou não
        if(size == 0)
            return true;
        else
            return false;
        
    }
    
}