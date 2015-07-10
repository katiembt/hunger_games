/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.control;

import triviahungergames.model.Player;
//import exceptions.programControlException;
import triviahungergames.TriviaHungerGames;

/**
 *
 * @author WINGU
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        System.out.println("\n**** createPlayer function called ****");
        if  (name==null) {
//            throw new programControlException("Player's name needs to be atleast."
//                                            +" two characters in length.");
//        }
        }
        
        Player player = new Player();
        player.setName(name);
        
       TriviaHungerGames.setPlayer(player);
        
        return player;
    }
    
}
