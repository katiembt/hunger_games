/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;

import triviahungergames.view.MainMenuView;
import triviahungergames.view.MoveView;

/**
 *
 * @author katherineblake
 */
public class GameMenuView extends View {
    
        public GameMenuView() {
            super("\n"
            +"\n---------------------------------------------"
            +"\n|                             Main Menu     |"
            +"\n---------------------------------------------"
            +"\nM - Map                                      "         
            + "\nS - Save Game                               "
            + "\nH - Help                                    "
            + "+\nR - Return                                 " 
            +"\n                                             "        
            +"\n---------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){  
            case 'M':
            case 'm':
                this.viewMoveView();
                break;  
            case 'H':
            case 'h':
                this.viewHelpMenu();
                break;    
            case 'S':
            case 's':
                this.saveGame();
                break;    
            case 'R':
            case 'r':
                return false;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again. ***");
                break;
        }
        return true;
    }
    

    private void viewMoveView() {
        MoveView moveView = new MoveView();
        moveView.display();
    }

   private void viewHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

   private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
   
   private void saveGame() {
        this.console.println("\n\n Please enter the file path where you would like this game to be saved.");
        String filePath = this.getInput();
        
        try{
            GameControl.saveGame(MainTriviaHungerGames.getCurrentGame(), filePath);
        }
        
        catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    }
    
}
