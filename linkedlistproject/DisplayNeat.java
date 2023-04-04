/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistproject;

import java.text.DecimalFormat;

/**
 * Demo of overloaded methods
 * Date Written     10/3/2012
 * @author Concept by:  Tony Gaddis (et al) modified by Stephen Brower
 */
public class DisplayNeat
{
    /**
     * number method takes an int and makes it pretty
     * @param number to be made pretty
     * @return String as pretty version of number
     */
    public static String number(int number)
    {
        DecimalFormat formatter = new DecimalFormat("#,##0");

        return formatter.format(number);
    }

    /**
     * * number method takes a double and makes it pretty
     * @param number to be made pretty
     * @return String as pretty version of number
     */
    public static String number(double number)
    {
        DecimalFormat formatter = new DecimalFormat("#,##0.00");

        return formatter.format(number);
    }
}

