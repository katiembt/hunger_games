/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;

/**
 *
 * @author  @author Katie Tooley
 */


public class BattleControl {
   public static double battle_p(double player_number){
        player_number = (Math.random()*((6-0)+0)) + (Math.pow(3, 2)) -3;
        return player_number;
   }
   
   public static double battle_t(double tribute_number){
        tribute_number = (Math.random()*((6-0)+0)) + (Math.pow(3, 2)) -3;
        return tribute_number;
   }
   
    public double calcBattleControl (double player_number,double tribute_number ) {
        
       
        
        if (player_number > tribute_number){
           System.out.println("You have given the tribute 25 damgage! ");
       }
       
       else if (player_number < tribute_number){
           System.out.println("You are hit! You lose 25 health points.");

       }
       
       else if (player_number == tribute_number){
           System.out.println("You and the tribute are hit. You both take 25 damage!");
       }
        
        double hit = player_number;
                return hit;
    } 
    
        private void BattleControlexception(String can_not_move_tribute_to_location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void BattleControlException(String invalid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
       

   
        
      
   
  


