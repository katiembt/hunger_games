/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;
import byui.cit260.hunger_games.model.Tributes;
import static java.util.Collections.list;

/**
 *
 * @author WINGU
 */
public class weakTribute {
    
    public Tributes int min = list[0];
        for(int i=1;i < list.length;i++){
            if(list[i] < min){
                min = list[i];
            }
        }
    return min;    
}
    

