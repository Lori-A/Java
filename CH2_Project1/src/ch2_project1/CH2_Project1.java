// Lori-Ann Nembhard

package ch2_project1;
import java.util.Scanner;
        
        
public class CH2_Project1 
{

    public static void main(String[] args)
    {
        String cookies;
        int cookiesEaten;
        int servingsInBag;
        int caloriesInServings;
        double totalCal;
        int cookiesAmt;
            
            
        Scanner keyboard= new Scanner (System.in);
            
        System.out.print ("Which cookies did you eat?");
            cookies = keyboard.nextLine();
            
        System.out.print ("How many cookies are there in a bag?");
            cookiesEaten = keyboard.nextInt();
            
        System.out.print ("How many servings are there in a bag?");
            servingsInBag = keyboard.nextInt();
            
        System.out.print ("How many calories are in a serving?");
            caloriesInServings = keyboard.nextInt();
            
        System.out.print ("\nHow many cookies did you eat?");
            cookiesAmt = keyboard.nextInt();
            
        totalCal= (double)(caloriesInServings * cookiesAmt*servingsInBag)/
                  (cookiesEaten);
          
        System.out.printf("\n %d %s cookies is %.1f calories",cookiesAmt,
                    cookies,totalCal);
            
            
        
            
                    
        
    }
    
}
