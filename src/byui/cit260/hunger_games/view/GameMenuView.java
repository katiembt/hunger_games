/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

/**
 *
 * @author katherineblake
 */
public class GameMenuView extends View {
    
        public GameMenuView() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| Main Menu                                  |"
            +"\n----------------------------------------------"
            +"\nM- Move-------------------------------------"         
            +"\nR- Return-------------------------------------"        
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){  
            case 'M':
            case 'm':
                this.viewMoveView();
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
    
  private void viewMoveView() {
        MoveView moveView = new MoveView();
        moveView.display();
    }

   

   private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}
