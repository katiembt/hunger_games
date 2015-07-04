/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;

import exceptions.HarvestControlException;

/**
 *
 * @author WINGU
 */
public class HarvestControl {
    
    public double calcHarvControl (double height, double distance) throws HarvestControlException {
        
       if ((height < 1) || (height > 20)) {
//           return -1;
           Throw new HarvestControlexception("Can not move tribute to location");
        
       }
       
        if ((distance < 1) || (distance > 20)) {
            Throw new HarvestControlexception("Can not move tribute to location");
//           return -1;
       }
       
                double diagonal = Math.sqrt((height * height) + (distance * distance)) ;
                return diagonal;
                throws new HarvestControlException("invalid");
    }

    private void HarvestControlexception(String can_not_move_tribute_to_location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void HarvestControlException(String invalid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
