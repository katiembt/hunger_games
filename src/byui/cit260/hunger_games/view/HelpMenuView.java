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
public class HelpMenuView extends View {

    public HelpMenuView(String promptMessage) {
        super( "\n"
            + "\n----------------------------------------"
            + "\n| Help Menu                           |"
            + "\n----------------------------------------"
            + "\nG - Start Game"
            + "\nH - get Help on How to Play the Game"
            + "\nS - Save Game"
            + "\nE - Exit Game"
            + "\n----------------------------------------");
        
    }
     
        
              @Override
    public boolean doAction(Object obj){
        String selection = (String)obj;
        switch (selection){
            case "G":
                this.helpGamePurpose();
                break;
             case "M":
                this.helpMove();
                break;
            case "B":
                this.helpBattle();
                break;
            case "S":
                this.helpHarvest();
                break; 
            case "S":
                this.helpFood();
                break;
            case "Q":
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;

        }
    }
}
