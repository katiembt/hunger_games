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
public class eatView extends View {
    
        public eatView() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| Eat                                       |"
            +"\n----------------------------------------------"   
            +"\nE - Eat"          
            +"\nR - Return"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'E':
            case 'e':
                this.viewEat();
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
    
    private void viewEat() {
        System.out.println("\n\n********************************************"
                            +"\n|            Eat                           |"
                            +"\n********************************************"
                            +"\n* Eat Food *"                   
                            +"\n********************************************");
                   
    }

   

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}