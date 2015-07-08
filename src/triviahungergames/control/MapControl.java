
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.control;

import triviahungergames.model.Location;
import triviahungergames.model.Player;
import triviahungergames.model.Map;
import triviahungergames.model.Game;
import exceptions.mapControlException;
import triviahungergames.MainTriviaHungerGames;
import java.awt.Point;


/**
 *
 * @author Wingu
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(5, 5);
        
        
//        MapControl.assignSceneToLocation(map);
        
        return map;
    }
    
//    public static void moveTributesToStartingLocation(Tributes tributes, Point coordinates) {
//        System.out.println("\n***called ***");
////            throws mapControlException{
//        
//         Map map = MainTriviaHungerGames.getCurrentGame().getMap();
//        int newRow = coordinates.x-1;
//        int newColumn = coordinates.y-1;
        
//        if(newRow < 0 ||newRow>= map.getNoRows()||
//            newColumn < 0 ||newColumn>= map.getNoColumns() ){
//        
//            Throw new mapControlexception("Can not move tribute to location"
//                                            + coordinates.x  + "," + coordinates.y
//                                            + "becase the location is outside the" +
//                                            "the bound of the map");
        
//    }
//    }
     public static void movePlayerToLocation(Player player, Point coordinates) {
//             throws mapControlException{
        
        Map map = MainTriviaHungerGames.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
//     }
  }
     }

//    private static void assignSceneToLocation(Map map) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
   


