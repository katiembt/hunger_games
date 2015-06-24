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
public class harvestMenuView extends View {
    
        public harvestMenuView() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| Harvest                                     |"
            +"\n----------------------------------------------"
              +"\nS - Harvest"            
            +"\nR - Return"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'H':
            case 'h':
                this.viewHarvest();
                break;   
            case 'R':
            case 'r':
                return false;
            default:
                System.out.println("\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }
    
    private void viewHarvest() {
        System.out.println("\n\n********************************************"
                            +"\n|            Map                           |"
                            +"\n********************************************"
                            +"\n* Answer the question correctly to open the *"
                            +"\n*  Aid package.                             *"
                            +"\n********************************************");
                   
    }

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}