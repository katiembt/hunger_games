/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

import byui.cit260.hunger_games.control.MapControl;
import hunger_games_text.Hunger_games_text;
import java.util.Scanner;

/**
 *
 * @author katherineblake
 */
public class MapControlView {
    
private final String MENU ="\n"
            + "\n----------------------------------------"
            + "\n Map Menu                            |"
            + "\n----------------------------------------"
            + "\nM - Move Location"
            + "\nV - View Location"
            + "\nC - Close Map"
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
            
            System.out.println("What do you want to do in the Map?");
            
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
                this.moveLocation();
                break;
             case 'V':
                this.viewLocation();
                break;
            case 'C':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
    }
    
    
   
    private void moveLocation() {
        
        MapControl.moveLocation(Hunger_games_text.getPlayer());
        
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.displayMenu();
    }

    private void viewLocation() {
       System.out.println("***This is ***, where  ***");
    }


}
