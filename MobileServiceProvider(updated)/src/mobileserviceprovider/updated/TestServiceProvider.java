//Lori-Ann Nembhard
package mobileserviceprovider.updated;
import java.util.Scanner;

/**
 *
 * @author g00298845
 */
public class TestServiceProvider 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String customersPackageInput;
        char customersPackage;
        int minutesUsed;

        MobileServiceProviderUpdated customersMobilePlan;

        System.out.print("Enter Customers Mobile package (A,B,C):");
        customersPackageInput = input.nextLine();
        customersPackage = customersPackageInput.charAt(0);

        while (customersPackage != 'a' && customersPackage != 'A'
               && customersPackage != 'b' && customersPackage != 'B'
                && customersPackage != 'c' && customersPackage != 'C')
        {
            System.out.println("\nInvalid package. Try again \n");
            
            System.out.print("Enter Customers Mobile package (A,B,C): ");
            
            customersPackageInput = input.nextLine();
            customersPackage = customersPackageInput.charAt(0);
        }
            
        

        // for this lab we assume a letter entered
        customersPackage = customersPackageInput.charAt(0);

        System.out.print("Enter the number of minutes the customer used their phone: ");
        minutesUsed = input.nextInt();
        
        while( minutesUsed < 0)
        {
            System.out.println("\nminutes must be >=0");
            System.out.println("\nEnter the number of minutes the customer "
                    + "used their phone:");
            minutesUsed = input.nextInt();
        }

        // instantiate the object
        customersMobilePlan = new MobileServiceProviderUpdated(customersPackage,
                minutesUsed);

        System.out.println("\n" + customersMobilePlan);

    }

}
