/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a2_cubes.squares.powers;

import java.util.Scanner;

/**
 * Jacob L
 * Oct 23, 2018
 * A program made top practice loops
 * 
 */
public class U2_A2_CubesSquaresPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner keyedInput = new Scanner(System.in);

        // Declare Variables
        int chosenOption = 0;//what will you do
        double chosenVariable;//the number that the user will efect
        double chosenExponent;//used in option 3
        double outputVariable;//the result
        
        while (chosenOption != 4)
        {
            //Display the Various Options
            System.out.println("Welcome to the Super Exponents Program");
            System.out.println("1... Please select one of the given options...");
            System.out.println("2... Find the value of a number squared...");
            System.out.println("3... Find the value of a number cubed...");
            System.out.println("4... Exit...\n");
            
            //Input Option
            System.out.println("What do you want to do?\n");
            chosenOption = keyedInput.nextInt();

            //Select Option
            switch (chosenOption){
                case 1:
                    System.out.println("What number would you like square?");
                    chosenVariable = keyedInput.nextDouble();
                    outputVariable = chosenVariable;//set output to chosen
                    
                    for (int i = 1; i < 2; i = i + 1)
                    {
                        outputVariable = outputVariable * chosenVariable;
                        System.out.println(outputVariable);
                    }
                    System.out.println("\n");
                    break;
                
                case 2:
                    System.out.println("What number would you like square?");
                    chosenVariable = keyedInput.nextDouble();
                    outputVariable = chosenVariable;//set output to chosen
                    
                    for (int i = 1; i < 3; i = i + 1)
                    {
                        outputVariable = outputVariable * chosenVariable;
                        System.out.println(outputVariable);
                    }
                    System.out.println("\n");
                    break;
                
                case 3:
                    System.out.println("What number would you like square?");
                    chosenVariable = keyedInput.nextDouble();
                    outputVariable = chosenVariable;//set output to chosen
                    
                    System.out.println("This number should be to the power of what?");
                    chosenExponent = keyedInput.nextDouble();
                    
                    for (int i = 1; i < chosenExponent; i = i + 1)
                    {
                        outputVariable = outputVariable * chosenVariable;
                        System.out.println(outputVariable);
                    }
                    System.out.println("\n");
                    break;
                
                case 4:
                    System.out.println("ALL DONE, CLOSING DOWN!");
                    System.out.println("\n");
                    break;
            }
            
        }
        
        
    }
    
}
