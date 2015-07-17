/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;

import triviahungergames.control.GameControl;
import triviahungergames.MainTriviaHungerGames;

/**
 *@katherineblake
 * @author WINGU
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n| Main Menu                                  |"
            +"\n----------------------------------------------"
            +"\nN - New Game"
            +"\nC - Continue Previous Game"
            +"\nH - Help"
            +"\nQ - Quit"
            +"\nT - TEST"
            +"\n----------------------------------------------");
    }
             
    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;

        switch(selection){
            case 'N':
            case 'n':
                this.viewQOne();
                break;
            case 'C':
            case 'c':
                this.continueExistingGame();
                break;
            case 'H':
            case 'h':
                this.displayQOne();
                break;
            case 'T':
            case 't':
                this.displayHelpMenu();
                break;
            case 'Q':
            case 'q':
                return false;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
        
        return true;
    }
//    private void startNewGame() {
//        System.out.println("***newGame function called ***");
//        GameControl.createNewGame(Hunger_games_text.getPlayer());
//        
//          gameMenuView.display();
//        private void viewGameMenu() {
//        GameMenuView gameMenuView = new GameMenuView();
//        gameMenuView.display();
//    }
    
    private void viewQOne() {
        QOne qOne = new QOne();
        qOne.display();
    }

    private void continueExistingGame() {
        System.out.println("*** continueExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
    
    
     private void displayQOne() {
        QOne qOne = new QOne();
        qOne.display();
    }
 
    
}