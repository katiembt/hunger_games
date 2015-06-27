/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;

import byui.cit260.hunger_games.model.Map;
import byui.cit260.hunger_games.model.Scene;
/**
 *
 * @author WINGU
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(10, 10);
        
        assignScenesToLocations(map);
        
        return map;
    }

    static void moveTributesToStartingLocation(Map map) {   
    }
    private static void assignScenesToLocations(Map map) { 
    }
    
}
