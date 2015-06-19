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
    
    public HelpMenuView(){
        super(
             switch (choice){
            case 'G':
                this.helpGamePurpose();
                break;
             case 'M':
                this.helpMove();
                break;
            case 'B':
                this.helpBattle();
                break;
            case 'S':
                this.helpHarvest();
                break; 
            case 'S':
                this.helpFood();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break);
                
        }
              @Override
        public boolean doAction(Object obj){
            
            String value = (String)obj;
            
            value = value.toUpperCase();
            char choice = value.charAt(0);
            
}
}
