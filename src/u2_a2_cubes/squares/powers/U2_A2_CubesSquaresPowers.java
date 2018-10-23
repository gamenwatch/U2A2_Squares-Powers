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
        double chosenExponant;//used in option 3
        double outputVariable;//the result
        
        while (chosenOption != 4)
        {
            //Display the Various Options
            System.out.println("Welcome to the Super Exponents Program");
            System.out.println("1... Please select one of the given options...");
            System.out.println("2... Find the value of a number squared...");
            System.out.println("3... Find the value of a number cubed...");
            System.out.println("4... Exit...");
            
            //Input Option
            System.out.println("What do you want to do?");
            chosenOption = keyedInput.nextInt();

            //Select Option
            switch (chosenOption){
                case 1:
                    System.out.println("What number would you like square?");
                    chosenVariable = keyedInput.nextDouble();
                    
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
            }
            
        }
        
        
    }
    
}
