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
public class MapControlView extends View {
    
        public MapControlView() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| Move                                       |"
            +"\n----------------------------------------------"
            +"\nM - Move"     
            +"\nH - Go to Harvest"          
            +"\nR - Return"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'M':
            case 'm':
                this.viewMove();
                break;
            case 'H':
            case 'h':
                this.viewGoHarvest();
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
    
    private void viewMove() {
        System.out.println("\n\n********************************************"
                            +"\n|            Map                           |"
                            +"\n********************************************"
                            +"\n*             Map                          *"
                            +"\n********************************************");
                   
    }
      private void viewGoHarvest() {
        System.out.println("\n\n********************************************"
                            +"\n|            HARVEST                         |"
                            +"\n********************************************"            
                            +"\n*                                          *"
                            +"\n********************************************");
                   
    }

   

    private void viewGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
}