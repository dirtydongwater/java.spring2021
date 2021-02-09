//***************************************************************
//
//  Developer:         poop
//
//  Program #:         Program 2
//
//  File Name:         Program2.java
//
//  Course:            Object-Oriented Programming - Java
//
//  Due Date:          2/9/2021
//
//  Instructor:        butthole
//
//  Chapter:           Chapter 2
//
//  Description:
//     Calculating total amount of a restaurant bill.
//***************************************************************

public class program_2 {
    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A
    //
    //**************************************************************

    public static void main(String[] args) {

        // declare variables here
        double meal_cost = 44.50;
        double tax_amount = 0.0825 * meal_cost; //($3.67)
        double tip_amount = 0.15 * meal_cost; //($6.675)
        double bill_total = meal_cost + tax_amount + tip_amount;

        developerInfo();

        //etc etc

        System.out.println("Total Bill Breakdown");
        System.out.println("________________________________");
        System.out.printf("Meal cost = $%.2f%n", meal_cost);
        System.out.printf("Tax amount = $%.2f%n", tax_amount);
        System.out.printf("Tip amount = $%.2f%n", tip_amount);
        System.out.printf("Total bill amount = $%.2f%n", bill_total);
    }

    //***************************************************************
    //
    //  Method:       developerInfo
    //
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void developerInfo()
    {
        System.out.println("Name:    Hornyprogrammer");
        System.out.println("Course:  Object-Oriented Programming");
        System.out.println("Program: Two \n");

    } // End of developerInfo


} //end of main method