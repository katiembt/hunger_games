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
public class MoveView extends View{
    
    public MoveView(){
        super("\n"
            + "\n----------------------------------------"
            + "\n| Move----------------------------------|"
            + "\nS Select Area                                                   "
            + "\n----------------------------------------"
            + "\nI - Information About Area------------------"
            + "\nenterkey - Confirm Move-------------------"
            + "\n----------------------------------------");        
    }
     @Override
        public boolean doAction(Object obj){        
            String selection = (String)obj;
            switch (selection){
               case "S":
               this.selectArea();
            break;
            case "I":
               this.areaInfo();
            break;      
            case "enterkey":
                 this.move();

            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;          
            }
     }


