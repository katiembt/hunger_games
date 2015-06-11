/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

import byui.cit260.hunger_games.control.InventoryControl;
import hunger_games_text.Hunger_games_text;
import java.util.Scanner;

/**
 *
 * @author WINGU
 */
public class InventoryMenuView {
    private final String MENU ="\n"
            + "\n----------------------------------------"
            + "\n Inventory Menu                            |"
            + "\n----------------------------------------"
            + "\nV - View Item"
            + "\nU - Use Item"
            + "\nC - Close Inventory"
            + "\n----------------------------------------";
    void displayMenu(){
        
        char selection = ' ';
        do { 
        
        System.out.println(MENU); //display Menu
        
        String input = this.getInput(); // get user selection
        selection = input.charAt(0); //getfirst character of string
        
        this.doAction(selection);     //do action based on selction
        
        } while (selection != 'C'); //an sel is not "EXIT"
    }

    private String getInput() {
        boolean valid = false; 
        String getInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("What do you want to do in the inventory?:");
            
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
                this.viewItem();
                break;
             case 'U':
                this.useFromInventory();
                break;
            case 'C':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
    }
    
    
   
    private void viewItem() {
        
        InventoryControl.viewItem(Hunger_games_text.getPlayer());
        
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.displayMenu();
    }

    private void useFromInventory() {
       System.out.println("***Would you like to use ***? ***");
    }


}
