import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        int op, value;

        do{
            System.out.print("\n1 - Add\n" +
                           "2 - remove\n" +
                           "3 - toString\n" +
                           "4 - search\n" +
                           "5 - isEmpty\n" + 
                           "6 - Order\n" + 
                           "7 - addLast\n-> ");
            op = sc.nextInt();
            System.out.println("\n"); // espaçamento
            switch(op){
                case 1:
                    System.out.print("Enter with a number: ");
                    value = sc.nextInt();
                    list.add(value);
                    break;

                case 2:
                    if(list.isEmpty()){
                        System.out.println("The list is empty.");
                        break;
                    }
                    System.out.print("What number you want to remove: ");
                    value = sc.nextInt();
                    list.remove(value);
                    break;

                case 3:
                    if(list.isEmpty()){
                        System.out.println("The list is empty.");
                        break;
                    }
                    list.toString();
                    break;

                case 4:
                    if(list.isEmpty()){
                        System.out.println("The list is empty.");
                        break;
                    }
                    System.out.print("What number you want to search: ");
                    value = sc.nextInt();
                    list.search(value);
                    break;

                case 5:
                    if(list.isEmpty())
                        System.out.println("The list is empty.");
                    else
                        System.out.println("The list isn't empty.");
                    break;

                case 6:
                    if(list.isEmpty()){
                        System.out.println("The list is empty.");
                        break;
                    }
                    break;

                case 7:
                    System.out.print("Enter with a number: ");
                    value = sc.nextInt();
                    list.addLast(value);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid option.");

            }
        }while(!(op == 0));
    }
}
