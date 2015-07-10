/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.control;

import exceptions.GameControlException;
import triviahungergames.TriviaHungerGames;
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
        TriviaHungerGames.setCurrentGame(game);
        
        game.setPlayer(player);
        
//        InventoryItem[] inventoryList = GameControl.createInventoryList();
//        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        }
        
        catch(IOException e){
            throw new GameControlException(e.getMessage());
        }
            
        
    }

    public static void continueGame(String filePath) throws GameControlException{
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();
        }
        catch(FileNotFoundException fnfe){
            throw new GameControlException(fnfe.getMessage());
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        
        TriviaHungerGames.setCurrentGame(game);
    }
        
//        MapControl.moveTributesToStartingLocation(map);
    }
    static void assignScene(Map map) {
        System.out.println("\n ** stub function called ** ");
    }
    
}
