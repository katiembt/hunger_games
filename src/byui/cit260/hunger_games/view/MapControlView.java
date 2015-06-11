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
public class MapControlView {
    private final String MENU ="\n"
            + "\n----------------------------------------"
            + "\n| Map Main Menu                    |"
            + "\n----------------------------------------"
            + "\nM - Move"
            + "\nH - Go to Harvast"
            + "\nE - Exit"
            + "\n----------------------------------------";
            
    
    void displayMenu(){
        
        char selection = ' ';
        do { 
        
        System.out.println(MENU); //display Menu
        
        String input = this.getInput(); // get user selection
        selection = input.charAt(0); //getfirst character of string
        
        this.doAction(selection);     //do action based on selction
        
        } while (selection != 'E'); //an sel is not "EXIT"
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
            case 'M':
                this.displayMoveMenu();
                break; 
            case 'H':
                this.displayHarvestMenu();
                break;     
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
    }

    private void displayHarvestMenu() {
         System.out.println("*** displayHarvestMenu function called***");
    }

    private void displayMoveMenu() {
         System.out.println("*** displayMoveMenu function called***");
    }

   
     
}
