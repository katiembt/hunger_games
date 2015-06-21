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
public class eatView extends View{

    
    public eatView(){
        super("\n"
            + "\n----------------------------------------"
            + "\n| Food                                 |"
            + "\n----------------------------------------"
            + "\nE - Eat Food"
            + "\nQ - Quit"
            + "\n----------------------------------------");        
    }
      @Override
    public boolean doAction(Object obj){
        String selection = (String)obj;
        switch (selection){
            case "E":
               this.eatFood();
                break;
            case "Q":
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;

        }
            
}
}
