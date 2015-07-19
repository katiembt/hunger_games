/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.control;

import triviahungergames.MainTriviaHungerGames;
import triviahungergames.model.Game;
import triviahungergames.model.Player;
import triviahungergames.model.Map;


/**
 *
 * @author WINGU
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        MainTriviaHungerGames.setCurrentGame(game);
        
        game.setPlayer(player);
        
//        InventoryItem[] inventoryList = GameControl.createInventoryList();
//        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        
//        MapControl.moveTributesToStartingLocation(map);
    }
    static void assignScene(Map map) {
        System.out.println("\n ** stub function called ** ");
    }
    
}