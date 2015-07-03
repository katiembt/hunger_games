/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;

import byui.cit260.hunger_games.model.Player;
import the_hunger_games.Hunger_Games;

/**
 *
 * @author WINGU
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        System.out.println("\n**** createPlayer function called ****");
        if  (name==null) {
        return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        Hunger_Games.setPlayer(player);
        
        return player;
    }
    
}
