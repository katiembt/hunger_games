/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

import byui.cit260.hunger_games.control.BattleControl;
import hunger_games_text.Hunger_games_text;
import java.util.Scanner;

/**
 *
 * @author katherineblake
 */
public class BattleMenuView extends View{
    
    public BattleMenuView(){
        super("\n"
            + "\n----------------------------------------"
            + "\n| Battle Menu                                                  |"
            + "\n----------------------------------------"
            + "\nF - Flee From Enemy"
            + "\nB - Take Chance and Brawl"
            + "\n----------------------------------------");        
    }
     @Override
        public boolean doAction(Object obj){
            
            String value = (String)obj;
            
            value = value.toUpperCase();
            char choice = value.charAt(0);
            
}
    
//    void displayMenu(){
//        
//        char selection = ' ';
//        do { 
//        
//        System.out.println(MENU); //display Menu
//        
//        String input = this.getInput(); // get user selection
//        selection = input.charAt(0); //getfirst character of string
//        
//        this.doAction(selection);     //do action based on selction
//        
//        } while (selection != 'E'); //an sel is not "EXIT"
//    }
//
//    private String getInput() {
//        boolean valid = false; 
//        String getInput = null;
//        Scanner keyboard = new Scanner(System.in);
//        
//        while(!valid){
//            
//            System.out.println("Enter The letter of your Selection Below:");
//            
//           getInput = keyboard.nextLine();
//           getInput = getInput.trim();
//            
//            if(getInput.length() < 1){
//                System.out.println("Invalid Input - the Input must not be blank");
//                continue;
//                
//            }
//            break;
//        }
//        return getInput;
//        
//        
//    }
//
//    private void doAction(char choice) {
//        
//        switch (choice){
//            case 'F':
//                this.flee();
//                break;
//             case 'B':
//                this.getRoll();
//                return;
//            default:
//                System.out.println("\n*** Invalid Selection *** Try Again");
//                break;
//                
//        }
//    }
//    
//    
//   
//    private void flee() {      
//        System.out.println("*** You have fled, but at a cost of 10% of your health***");
//    }
//
//    private void getRoll() {
//       System.out.println("*** You make your move and atacked ***");
//    }
//    
//}
