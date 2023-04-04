//Lori-Ann Nembhard
package linkedlistproject;
import java.util.Scanner;

/**
 *
 * @author lori2
 */
public class LinkedListProject 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double sizeInput;
        String brandInput;
        String customerInput;

        Scanner keyboard = new Scanner(System.in);

        SinglyLinkedList<Shoes> myShoes = new SinglyLinkedList<Shoes>();
        do 
        {

            System.out.println("\nBag of Shoes");
            System.out.println("A - add shoes to bag"
                    + "\nR - Remove 'Shoes' from bag"
                    + "\nF - Find 'Shoes' in bag (exits)"
                    + "\nD - Display contents of the bag"
                    + "\nX  - Exit");

            System.out.print("Enter selection: ");
            customerInput = keyboard.nextLine();

            if (customerInput.equals("X") || customerInput.equals("x")) 
            {
                System.out.println("Goodbye!");
            } else if (customerInput.equals("A") || customerInput.equals("a")) 
            {
                System.out.print("\nEnter name of shoes to add to the bag: ");
                brandInput = keyboard.nextLine();

                System.out.print("Enter size of shoes to add to the bag: ");
                sizeInput = keyboard.nextDouble();
                keyboard.nextLine();

                myShoes.add(new Shoes(sizeInput, brandInput));

            } 
            else if (customerInput.equals("R") || customerInput.equals("r")) 
            {
                System.out.print("\nEnter name of shoes to remove from bag: ");
                brandInput = keyboard.nextLine();

                System.out.print("Enter size of shoes to remove from bag: ");
                sizeInput = keyboard.nextDouble();
                keyboard.nextLine();

                Shoes anotherShoes = new Shoes(sizeInput, brandInput);

                if (myShoes.remove(anotherShoes)) 
                {
                    System.out.println("\n"+anotherShoes.getBrand()
                            + " with size "
                            + anotherShoes.getSize() + " removed!");
                } 
                else 
                {
                    System.out.println("\nOops "
                            + anotherShoes.getBrand() + " with size "
                            + anotherShoes.getSize() + " not removed! ");
                }
            } 
            else if (customerInput.equals("F") || customerInput.equals("f")) 
            {
                System.out.print("\nEnter the brand of shoes to find: ");
                brandInput = keyboard.nextLine();

                System.out.print("Enter the size of shoes to find: ");
                sizeInput = keyboard.nextDouble();
                keyboard.nextLine();

                Shoes anotherShoes = new Shoes(sizeInput, brandInput);
                if (myShoes.exists(anotherShoes)) 
                {
                    System.out.println("\n"+ anotherShoes.getBrand() + " "
                            + anotherShoes.getSize()
                            + " is in the bag!");
                } 
                else 
                {
                    System.out.println("\n" + anotherShoes.getBrand() + " "
                            + anotherShoes.getSize()
                            + " is not in the bag!");
                }

            } 
            else if (customerInput.equals("D")
                    || customerInput.equals("d")) 
            {

                if (myShoes.getSize() == 0) 
                {
                    System.out.print("--Empty--\n");
                }
                Lister<Shoes> shoesList = myShoes.iterator();
                while (shoesList.hasNext()) 
                {
                    Shoes displayShoes = shoesList.next();
                    System.out.print("{" + displayShoes.getBrand() + " "
                            + displayShoes.getSize() + "}");
                    if (shoesList.hasNext()) 
                    {
                        System.out.print(", ");
                    }

                }
                System.out.println("\tSize: " + myShoes.getSize() + "\n");

            } 
            else 
            {
                System.out.println("\nYou entered an invalid choice!");
            }

        } 
        while (!(customerInput.equals("X") || customerInput.equals("x")));
    }
}
