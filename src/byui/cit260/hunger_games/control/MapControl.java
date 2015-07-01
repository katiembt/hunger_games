///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.hunger_games.control;
//
//import byui.cit260.hunger_games.model.Map;
//import byui.cit260.hunger_games.model.Scene;
///**
// *
// * @author WINGU
// */
//public class MapControl {
//
//    static Map createMap() {
//        Map map = new Map(10, 10);
//        
//        assignScenesToLocations(map);
//        
//        return map;
//    }
//
//    static void moveTributesToStartingLocation(Map map) {   
//    }
//    private static void assignScenesToLocations(Map map) { 
        
//    }
//    
//}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.control;

import byui.cit260.hunger_games.model.Location;
import byui.cit260.hunger_games.model.Map;
import byui.cit260.hunger_games.model.Scene;


/**
 *
 * @author Carlee Ouwerkerk
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(5, 5);
        
        
        GameControl.assignScene(map);
        
        return map;
    }

    static void moveTributeStart(Map map) {
        System.out.println("\n***called ***");
    }


    private static void assignScene(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
       
    }
    
}