/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;

import byui.cit260.hunger_games.model.Game;
import byui.cit260.hunger_games.model.Player;
import byui.cit260.hunger_games.model.Map;
import byui.cit260.hunger_games.model.Item;

/**
 *
 * @author WINGU
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        hunger_games_text.setCurrentGame(game);
        
        game.setPlayer(player);
        
//        InventoryItem[] inventoryList = GameControl.createInventoryList();
//        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        
        mapControl.moveTributeToStartingLocation(map);
    }
    static void assignScene(Map map) {
        System.out.println("\n ** stub function called ** ");
    }
    
}