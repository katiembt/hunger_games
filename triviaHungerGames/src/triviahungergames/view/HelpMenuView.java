/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;

import java.util.Scanner;
/**
 *
 * @author katherineblake
 */
public class HelpMenuView extends View {
    
        public HelpMenuView() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| Help Menu                                  |"
            +"\n----------------------------------------------"
            +"\nO - Objective"
            +"\nM - Move "
            +"\nA - Aid Packages"
            +"\nI - View inventory"
            +"\nF - Food"
            +"\nB - Battle"        
            +"\nR - Return"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'O':
            case 'o':
                this.viewObjectivesHelp();
                break;
            case 'M':
            case 'm':
                this.viewMoveHelp();
                break;
            case 'A':
            case 'a':
                this.viewAidHelp();
                break;
            case 'I':
            case 'i':
                this.viewInventoryHelp();
                break;
            case 'B':
            case 'b':
                this.viewBattleHelp();
                break;   
             case 'F':
            case 'f':
                this.viewFoodHelp();
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
    
    private void viewObjectivesHelp() {
        this.console.println("\n\n********************************************"
                            +"\n|            The Objective                 |"
                            +"\n********************************************"
                            +"\n* The objective of the game is to survive. *"
                            +"\n*                                          *"
                            +"\n* You do so by killing all other tributes. *"
                            +"\n* If you fail to kill them they will kill  *"
                            +"\n* you.Last tribute standing wins.          *"
                            +"\n*                                          *"
                            +"\n********************************************");
                   
    }

    private void viewMoveHelp() {
        this.console.println("\n\n*********************************************"
                            +"\n************** Move Help*** *****************"
                            +"\n* To move in this game you will nee to find *"
                            +"\n* your current location. To do so select    *"
                            +"\n* the map or 'M'. Now that the map is open  *"
                            +"\n* find the location you want to move to     *"
                            +"\n* you can only move one sqaure at a time    *"
                            +"\n* yso choose wisely.                        *"
                            +"\n*********************************************");
    
    }

    private void viewAidHelp() {
        this.console.println("\n\n********************************************"
                            +"\n************* Aid Help *********************"
                            +"\n* To open an aid package you must input    *"
                            +"\n* the correct information. If the info  is *"
                            +"\n*is correct you will be open the aid.      *"
                            +"\n********************************************");
    }

    private void viewInventoryHelp() {
        this.console.println("\n\n********************************************"
                            +"\n*************** Inventory ******************"
                            +"\n********************************************");
    }
    
     private void viewBattleHelp() {
        this.console.println("\n\n********************************************"
                            +"\n*************** BATTLE    ******************"
                            +"\n********************************************");
    }
     private void viewFoodHelp() {
        this.console.println("\n\n********************************************"
                            +"\n*************** Food Help ******************"
                            +"\n********************************************");
    }

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}