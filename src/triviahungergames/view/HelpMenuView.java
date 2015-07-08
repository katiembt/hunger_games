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
            +"\n---------------------------------------------"
            +"\n|                               Help Menu                               |"
            +"\n---------------------------------------------"
            +"\nO - Objective"
            +"\nM - Move Help"
            +"\nQ - Question Help"        
            +"\nR - Return"
            +"\n                                                                               "
            +"\n---------------------------------------------");
            
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
            case 'Q':
            case 'q':
                this.viewQuestionHelp();
                break;   
            case 'R':
            case 'r':
                return false;
            default:
                System.out.println
                             ("\n******* Invalid selection, try again. *******");
                break;
        }
        return true;
    }
    
    private void viewObjectivesHelp() {
        System.out.println
                             ("\n\n***************************************"
                            +"\n|                    The Objective                    |"
                            +"\n*****************************************"
                            +"\n* The objective of the game is to survive *"
                            +"\n*                                                          *"
                            +"\n* You do so by answering questions        *"
                            +"\n* correctly, and every question correctly, *"
                            +"\n* or else you die losing to another tribute.*"
                            +"\n*                                                          *"
                            +"\n*****************************************");
                   
    }

    private void viewMoveHelp() {
        System.out.println
                             ("\n\n***************************************"
                            +"\n|                      Move Help                      |"
                            +"\n*****************************************"
                            +"\n* To move in this game you will need to   *"
                            +"\n* defeat a competing tribute, you will      *"
                            +"\n* automatically be transfere to the next   *"
                            +"\n* location on the map.                            *"
                            +"\n*                                                          *"         
                            +"\n*****************************************");
    
    }
    
     private void viewQuestionHelp() {
        System.out.println
                             ("\n\n***************************************"
                            +"\n|                   Question Help                    |"
                            +"\n*****************************************"
                            +"\n* We can't give you the answers, try         *"
                            +"\n* Googling it or something, if don't know, *"
                            +"\n* but you should already know these.      *"
                            +"\n*                                                          *"         
                            +"\n*****************************************");
    }

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}
