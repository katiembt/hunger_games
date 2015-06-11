/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

import byui.cit260.hunger_games.control.GameControl;
import hunger_games_text.Hunger_games_text;
import java.util.Scanner;

/**
 *@katherineblake
 * @author WINGU
 */
////public class MainMenuView {
////    startProgram() : void;
//    
//}

public class MainMenuView {
    
    private final String MENU ="\n"
            + "\n----------------------------------------"
            + "\n| Main Menu                            |"
            + "\n----------------------------------------"
            + "\nG - Start Game"
            + "\nH - get Help on How to Play the Game"
            + "\nS - Save Game"
            + "\nE - Exit Game"
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
            case 'N':
                this.startNewGame();
                break;
             case 'G':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break; 
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
    }
    
    
   
    private void startNewGame() {
//        System.out.println("*** startNewGame function called ***");
        //create new game
        
        GameControl.createNewGame(Hunger_games_text.getPlayer());
        
        //dsiplay Game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
       System.out.println("*** startExistingGame function called***");
    }


    private void saveGame() {
       System.out.println("*** saveGame function called***");
    }

    private void displayHelpMenu() {

    }
    
}
