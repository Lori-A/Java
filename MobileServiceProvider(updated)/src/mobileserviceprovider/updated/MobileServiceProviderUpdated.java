package mobileserviceprovider.updated;
import java.util.Scanner;
/**
 *
 * @author lori2
 */
public class MobileServiceProviderUpdated
{
private char customersPackage;
private int numberOfMinutesUsed;

    public MobileServiceProviderUpdated (char newCustomersPackage, 
            int newNumberOfMinutesUsed)
   
    {
        customersPackage = newCustomersPackage;
        numberOfMinutesUsed = newNumberOfMinutesUsed;
        
    }
    /**

*  This method receives customer's package.

* @param null This method does not pass in a value
* @param null This method does not pass in a value

* @return This method returns the customer package that was input by customer

*/
    public char getCustomerPackage()
    {
        return customersPackage;
    }
  /**
*  This method receives number of minutes used
* @param null This method does not pass in a value
* @return This method returns the number of minutes used
*/
    public int getNumberOfMinutesUsed()
    {
        return numberOfMinutesUsed;
    }
/**
*  This method sets customer package = new customer package
* @param newCustomerPackage This method passes in the new value as a character 
* @return This method returns the value of the customer's package
*/
    public void setCustomerPackage(char newCustomerPackage)
    {
        customersPackage = newCustomerPackage;
        
    }
    /**
*  This method sets number of minutes used
* @param newNumberOfMinutes This method passes in the new value as an int
* @return This method returns the value of the number of minutes used
*/
    public void setNumberOfMinutesUsed (int newNumberOfMinutes)
    {
        numberOfMinutesUsed = newNumberOfMinutes;
        
    }
    
    public double totalCharges()
    {   
      double totalCost=0;  
      
      
      if (customersPackage == 'a' || customersPackage=='A')
          if (numberOfMinutesUsed > 450)
              totalCost= (numberOfMinutesUsed - 450)*0.45 + 39.99;
          else
              totalCost += 39.99;
          
      if (customersPackage == 'b'|| customersPackage == 'B')            
          if (numberOfMinutesUsed > 900)
              totalCost= (numberOfMinutesUsed - 900)*0.40 + 59.99;
          else
              totalCost +=59.99;
      
     else if (customersPackage =='c'|| customersPackage == 'C')
          totalCost += 69.99;

      return totalCost;
    }
    
    
   public String toString()
   {
      
      String str = "MSP Plan: " + customersPackage +
                   " Min: " + numberOfMinutesUsed + " $" +
                   totalCharges();

      return str;
     
   }       
   
              
   }

 

 

