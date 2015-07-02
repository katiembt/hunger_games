
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
        
            Throw new mapControlexception(Can not move tribute to location)
        
    }
    }


    private static void assignScene(Map map, Scene[] scenes) {
//        Location[][] locations = map.getLocations();
        
       
    }
    
}