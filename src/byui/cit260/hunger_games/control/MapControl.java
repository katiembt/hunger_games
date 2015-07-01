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
        System.out.println("\n*** moveTributesToStartingLocation stub function called ***");
    }


    private static void assignScene(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(Scene.start);
        locations[0][1].setScene(Scene.lake);
        locations[0][2].setScene(Scene.lake);
        locations[0][3].setScene(Scene.lake);
        locations[0][4].setScene(Scene.lake);
        locations[0][5].setScene(Scene.swamp);
        locations[1][0].setScene(Scene.swamp);
        locations[1][1].setScene(Scene.swamp);
        locations[1][2].setScene(Scene.swamp);
        locations[1][3].setScene(Scene.forest);
        locations[1][4].setScene(Scene.forest);
        locations[1][5].setScene(Scene.forest);
        locations[2][0].setScene(Scene.forest);
        locations[2][1].setScene(Scene.forest);
        locations[2][2].setScene(Scene.forest);
        locations[2][3].setScene(Scene.forest);
        locations[2][4].setScene(Scene.forest);
        locations[2][5].setScene(Scene.mountain);
        locations[3][0].setScene(Scene.mountain);
        locations[3][1].setScene(Scene.forest);
        locations[3][2].setScene(Scene.lake);
        locations[3][3].setScene(Scene.swamp);
        locations[3][4].setScene(Scene.swamp);
        locations[3][5].setScene(Scene.swamp);
        locations[4][0].setScene(Scene.swamp);
        locations[4][1].setScene(Scene.swamp);
        locations[4][2].setScene(Scene.mountain);
        locations[4][3].setScene(Scene.mountain);
        locations[4][4].setScene(Scene.forest);
        locations[4][5].setScene(Scene.forest);
        locations[5][0].setScene(Scene.finish);
        locations[5][1].setScene(Scene.field);
        locations[5][2].setScene(Scene.field);
        locations[5][3].setScene(Scene.mountain);
        locations[5][4].setScene(Scene.mountain);
        locations[5][5].setScene(Scene.finish);

    }
    
}