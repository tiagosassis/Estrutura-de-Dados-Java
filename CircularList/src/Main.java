import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularList listC = new CircularList(); 
        int op, value; // opção digitada no menu
        do{
            System.out.println("\n\n\tCircular List");
            System.out.print("1 - Add a number\n"+
                            "2 - Remove a number\n"+
                            "3 - Show all\n"+
                            "4 - Search\n"+
                            "5 - It's empty?\n"+
                            "6 - Order\n" +
                            "7 - Clear List\n" +
                            "0 - Exit\n..-> ");
            op = input();

            switch(op){
                case 1: // add
                    System.out.print("\nValue: ");
                    value = input();
                    listC.add(value);
                    break;

                case 2: // remove
                    System.out.print("\nValue: ");
                    value = input();
                    listC.remove(value);
                    break;

                case 3: // show all
                    listC.showAll();
                    break;
                    
                case 4: // search
                    System.out.print("Value to be search: ");
                    value = input();
                    listC.search(value);
                    System.out.println(); // Espaçamento
                    break;
                    
                case 5: // is empty
                    if(listC.isEmpty())
                        System.out.println("\nThe list is empty.");
                    else
                        System.out.println("\nThe list isn't empty.");
                    break;
                
                case 6: // Order
                    listC.order();
                    break;

                case 7:
                    listC.clearList();
                    System.out.println("\nAll value's removed.");
                    break;


                case 0: // exit
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }while(!(op == 0));
    }

    public static final int input(){ // Tratamento de exceção para a entrada de dados do usuário
        while(true){
            try{ // se o valor digitado não for um int, ele pede de novo até a entrada ser válida
                Scanner sc = new Scanner(System.in);
                int value = sc.nextInt();
                return value;
            }
            catch (Exception e) {
                System.out.println("Invalid value, enter an integer.");
                System.out.print("-> ");
            }
        }
    }
}
