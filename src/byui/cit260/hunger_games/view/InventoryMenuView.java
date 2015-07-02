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
public class InventoryMenuView extends View {
    
        public InventoryMenuView() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| Inventory menu View                        |"
            +"\n----------------------------------------------"
            +"\nO - Open Inventory"     
            +"\nR - Return"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'O':
            case 'o':
                this.viewInventory();
                break;
            case 'R':
            case 'r':
            default:
                System.out.println("\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }
    
    private void viewInventory() {
        System.out.println("\n\n********************************************"
                            +"\n|          Your Current Inventory          |"
                            +"\n********************************************"
                            +"\n* Items            *"
                            +"\n*                                           *"
                            +"\n********************************************");
                   
    }
     

   

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}