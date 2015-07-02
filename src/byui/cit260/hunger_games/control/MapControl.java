
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;

import byui.cit260.hunger_games.model.Location;
import byui.cit260.hunger_games.model.Map;
import byui.cit260.hunger_games.model.Scene;
import exceptions.mapControlException;


/**
 *
 * @author Wingu
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(5, 5);
        
        
        GameControl.assignScene(map);
        
        return map;
    }

    static void moveTributeStart(Map map) {
        System.out.println("\n***called ***");
        throws mapControlException {
        
        Map map = hunger_games.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newRow = coordinates.y-1;
        
        if(newRow < 0 ||newRow>= map.getNoRows()||
            newColumn < 0 ||newColumn>= map.getNoColumns() ){
        
            Throw new mapControlexception("Can not move tribute to location"
                                            + coordinates.x  + "," + coordinates.y
                                            + "becase the location is outside the" +
                                            "the bound of the map");
        
    }
    }


    private static void assignScene(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
       
        locations[0][0].setScene(scenes[SceneType.mountain]);
        locations[0][1].setScene(scenes[SceneType.mountain]);
        locations[0][2].setScene(scenes[SceneType.mountain]);
        locations[0][3].setScene(scenes[SceneType.mountain]);
        locations[0][4].setScene(scenes[SceneType.mountain]);
        
        locations[0][0].setScene(scenes[SceneType.lake]);
        locations[0][1].setScene(scenes[SceneType.lake]);
        locations[0][2].setScene(scenes[SceneType.lake]);
        locations[0][3].setScene(scenes[SceneType.lake]);
        locations[0][4].setScene(scenes[SceneType.lake]);
        
        locations[0][0].setScene(scenes[SceneType.forest]);
        locations[0][1].setScene(scenes[SceneType.forest]);
        locations[0][2].setScene(scenes[SceneType.forest]);
        locations[0][3].setScene(scenes[SceneType.forest]);
        locations[0][4].setScene(scenes[SceneType.forest]);
        
        locations[0][0].setScene(scenes[SceneType.swamp]);
        locations[0][1].setScene(scenes[SceneType.swamp]);
        locations[0][2].setScene(scenes[SceneType.swamp]);
        locations[0][3].setScene(scenes[SceneType.swamp]);
        locations[0][4].setScene(scenes[SceneType.swamp);
        
        locations[0][0].setScene(scenes[SceneType.swamp]);
        locations[0][1].setScene(scenes[SceneType.swamp]);
        locations[0][2].setScene(scenes[SceneType.swamp]);
        locations[0][3].setScene(scenes[SceneType.swamp]);
        locations[0][4].setScene(scenes[SceneType.swamp]);
        
        return;
       
    }
    private static Scene[] createScenes() {
        
        Game game = hunger_games.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene mountainScene = new Scene();
        mountainScene.setDescription("MOUNTAIN");
        mountainScene.setMapSymbol(" ^ ");
        scenes[SceneType.Mountain()] = mountainScene;
        
        Scene swampScene = new Scene();
        swampScene.setDescription("SWAMP");
        swampScene.setMapSymbol(" # ");
        scenes[SceneType.swamp()] = swampScene;
        
        Scene lakeScene = new Scene();
        lakeScene.setDescription("this LAKE is not so peaceful.");
        lakeScene.setMapSymbol(" @ ");
        scenes[SceneType.lake()] = lakeScene;
        
        Scene forestScene = new Scene();
        forestScene.setDescription("You are in the FOREST. Watch Out There are more then just wild animals here.");
        forestScene.setMapSymbol(" $ ");
        scenes[SceneType.forest()] = forestScene;
      
    
        return scenes;
   }
   
}
