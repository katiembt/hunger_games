/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;

import the_hunger_games.Hunger_Games;
import byui.cit260.hunger_games.model.Game;
import byui.cit260.hunger_games.model.Player;
import byui.cit260.hunger_games.model.Map;
import byui.cit260.hunger_games.model.Item;
import byui.cit260.hunger_games.control.MapControl;

/**
 *
 * @author WINGU
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        Hunger_Games.setCurrentGame(game);
        
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
