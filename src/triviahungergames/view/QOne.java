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
public class QOne extends View {
    
        public QOne() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District One Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| How old was President Katniss Everdeen      |"
            +"\n| when she first attend the Hunger Games?    |"        
            +"\nA - 17"
            +"\nB - 14"
            +"\nC - 16"
            +"\nD - 15"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'A':
            case 'a':
                this.viewDied();
                break;
            case 'B':
            case 'b':
                this.viewDied();
                break;
            case 'C':
            case 'c':
                this.viewNextQuestion();
                break;
            case 'D':
            case 'd':
                this.viewDied();
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
    
     private void viewNextQuestion() {
        QTwo qTwo = new QTwo();
        qTwo.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}