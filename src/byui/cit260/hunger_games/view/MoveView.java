/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.view;

/**
 *
 * @author WINGU
 */
public class MoveView extends View {
    
        public MoveView() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| Move                                       |"
            +"\n----------------------------------------------"
            +"\nM - Select Map"     
            +"\nM - Map"          
            +"\nR - Return"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'M':
            case 'm':
                this.viewSelectMap();
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
    
    private void viewOpenAid() {
        System.out.println("\n\n********************************************"
                            +"\n|            Open Aid                      |"
                            +"\n********************************************"
                            +"\n* Answer the question correctly to open the *"
                            +"\n*  Aid package.                             *"
                            +"\n********************************************");
                   
    }

   

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}