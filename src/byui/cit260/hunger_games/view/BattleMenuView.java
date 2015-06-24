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
public class BattleMenuView extends View {
    
        public BattleMenuView() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| Aid View                                 |"
            +"\n----------------------------------------------"
            +"\nO - Open Aid"     
            +"\nR - Return"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'O':
            case 'o':
                this.viewOpenAid();
                break;
            case 'R':
            case 'r':
                this.viewFlee();
            default:
                System.out.println("\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }
    
    private void viewOpenAid() {
        System.out.println("\n\n********************************************"
                            +"\n|          BATTLE!!!                     |"
                            +"\n********************************************"
                            +"\n* You have decided to fight                *"
                            +"\n*                                           *"
                            +"\n********************************************");
                   
    }
        private void viewFlee() {
        System.out.println("\n\n********************************************"
                            +"\n|            RUNNNNN!!!!                   |"
                            +"\n********************************************"
                            +"\n* You have decided to run!                 *"
                            +"\n*                                          *"
                            +"\n********************************************");
                   
    }

   

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}