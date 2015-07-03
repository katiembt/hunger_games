/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

import byui.cit260.hunger_games.control.GameControl;
import the_hunger_games.Hunger_Games;

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
                this.viewGameMenu();
                break;
            case 'C':
            case 'c':
                this.continueExistingGame();
                break;
            case 'H':
            case 'h':
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
        private void viewGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }


    private void continueExistingGame() {
        System.out.println("*** continueExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
 
    
}
