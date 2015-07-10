/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;

import triviahungergames.control.GameControl;
import triviahungergames.TriviaHungerGames;

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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again. ***");
                break;
        }
        
        return true;
    }
    private void startNewGame() {
       this.console.println("***newGame function called ***");
       GameControl.createNewGame(TriviaHungerGames.getPlayer());
     
        gameMenuView.display();
    }
    
    private void viewGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }


    private void continueExistingGame() {
         this.console.println("\n\nEnter the file path where the game is saved.");
        
        String filePath = this.getInput();
        
        try{
            GameControl.continueGame(filePath);
        }
        
        catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
 
    
}
