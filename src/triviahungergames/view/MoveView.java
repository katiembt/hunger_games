/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;

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
            +"\nS - Select Map"     
            +"\nM - Move"          
            +"\nR - Return"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'S':
            case 's':
                this.viewSelectMap();
                break;
            case 'M':
            case 'm':
                this.viewMove();
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
    
    private void viewSelectMap() {
        System.out.println("\n\n********************************************"
                            +"\n|            Map                           |"
                            +"\n********************************************"
                            +"\n* Answer the question correctly to open the *"
                            +"\n*                                           *"
                            +"\n********************************************");
                   
    }
      private void viewMove() {
        System.out.println("\n\n********************************************"
                            +"\n|            Move                          |"
                            +"\n********************************************"
                            +"\n* Where do you wantt to move?               *"
                            +"\n*                                          *"
                            +"\n********************************************");
                   
    }

   

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

   
    
}