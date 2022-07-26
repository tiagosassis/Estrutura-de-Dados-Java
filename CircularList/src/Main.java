import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        CircularList listC = new CircularList(); 
        int op, value; // opção digitada no menu
        do{
            System.out.println("\n\n\tCircular List");
            System.out.print("1 - Add a number\n"+
                            "2 - Remove a number\n"+
                            "3 - Show all\n"+
                            "4 - Search\n"+
                            "5 - It's empty?\n"+
                            "0 - Exit\n..-> ");
            op = sc.nextInt();
            switch(op){
                case 1: // add
                    System.out.print("\nValue: ");
                    value = sc.nextInt();
                    listC.add(value);
                    break;

                case 2: // remove
                    System.out.print("\nValue: ");
                    value = sc.nextInt();
                    listC.remove(value);
                    break;

                case 3: // show all
                    listC.showAll();
                    break;
                    
                case 4: // search
                    System.out.print("Value to be search: ");
                    value = sc.nextInt();
                    listC.search(value);
                    System.out.println(); // Espaçamento
                    break;
                    
                case 5: // is empty
                    if(listC.isEmpty())
                        System.out.println("The list is empty.");
                    else
                    System.out.println("The list isn't empty.");
                    break;

                case 0: // exit
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }while(!(op == 0));
    }
}
