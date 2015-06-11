/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

import java.util.Scanner;

/**
 *
 * @author katherineblake
 */
public class AidControlView {
private final String MENU ="\n"
            + "\n----------------------------------------"
            + "\n| Aid Control Menu                                                  |"
            + "\n----------------------------------------"
            + "\nV - Calcuate the Volume"
            + "\nR - Find the Radius"
            + "\nQ - Quit, I don't need any aid. "
            + "\n----------------------------------------";
            
    
    void displayMenu(){
        
        char selection = ' ';
        do { 
        
        System.out.println(MENU); //display Menu
        
        String input = this.getInput(); // get user selection
        selection = input.charAt(0); //getfirst character of string
        
        this.doAction(selection);     //do action based on selction
        
        } while (selection != 'Q'); //an sel is not "EXIT"
    }

    private String getInput() {
        boolean valid = false; 
        String getInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("Enter The letter of your Selection Below:");
            
           getInput = keyboard.nextLine();
           getInput = getInput.trim();
            
            if(getInput.length() < 1){
                System.out.println("Invalid Input - the Input must not be blank");
                continue;
                
            }
            break;
        }
        return getInput;
        
        
    }

    private void doAction(char choice) {
        
        switch (choice){
            case 'V':
                this.getVolume();
                break;
             case 'R':
                this.getRadius();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
    }
    
    
   
    private void getVolume() {      
        System.out.println("*** Please calculate the volume of the spheracle aid item to recieve the aid within.***");
    }

    private void getRadius() {
       System.out.println("*** The radius of the aid is *** inches. ***");
    }
    
}
