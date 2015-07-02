/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;

/**
 *
 * @author WINGU
 */
public class HarvestControl {
    
    public double calcHarvControl (double height, double distance) {
        
       if ((height < 1) || (height > 20)) {
           return -1;
       }
       
        if ((distance < 1) || (distance > 20)) {
           return -1;
       }
       
                double diagonal = Math.sqrt((height * height) + (distance * distance)) ;
                return diagonal;

    }
}
