/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_hunger_games;

import byui.cit260.hunger_games.model.Game;
import byui.cit260.hunger_games.model.Inventory;
import byui.cit260.hunger_games.model.Item;
import byui.cit260.hunger_games.model.Location;
import byui.cit260.hunger_games.model.Map;
import byui.cit260.hunger_games.model.Player;
import byui.cit260.hunger_games.model.Scene;
import byui.cit260.hunger_games.model.Tributes;
import byui.cit260.hunger_games.view.StartProgramView;


/**
 *
 * @author WINGU 
 * @author katherineblake
 * 
 */
public class Hunger_Games{
    
    private static Game currentGame = null;
    private static Player player = null;

     public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        try {
          startProgramView.startProgram();   
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
    //Player
//       Player created = new Player();
//       created.setName("?");
//       created.setGender("?");
//       created.setDistrict("District #");
//       created.setSkills("picked up");
//       created.setHealthPoints(100);
//       created.setStrength(25);
//       
//       String PlayerCreated  = created.toString();
//       System.out.println(created);
//        
        //Tribute one Male
//    Tributes oneM = new Tributes();
//        oneM.setName("Jett");
//        oneM.setGender("male");
//        oneM.setDistrict("District 1");
//        oneM.setSkills("poison daggers");
//        oneM.setHealthPoints(150);
//        oneM.setStrength(20);
//
//        String TributesOneM = oneM.toString();
//        System.out.println(oneM);
//        
//         //Tribute one female
//     Tributes oneF = new Tributes();
//        oneF.setName("Scarlett");
//        oneF.setGender("female");
//        oneF.setDistrict("District 1");
//        oneF.setSkills("whip");
//        oneF.setHealthPoints(150);
//        oneF.setStrength(20);
//
//        String TributesOneF = oneF.toString();
//        System.out.println(oneF);
//        
//       //Tribute two Male
//     Tributes twoM = new Tributes();
//        twoM.setName("Mako");
//        twoM.setGender("male");
//        twoM.setDistrict("District 2");
//        twoM.setSkills("iron rod");
//        twoM.setHealthPoints(100);
//        twoM.setStrength(15);
//        
//        String TributesTwoM = twoM.toString();
//        System.out.println(twoM);
//        
//         //Tribute two female
//     Tributes twoF = new Tributes();
//        twoF.setName("Angel");
//        twoF.setGender("");
//        twoF.setDistrict("District 2");
//        twoF.setSkills("brick");
//        twoF.setHealthPoints(95);
//        twoF.setStrength(15);
//
//        String TributesTwoF = twoF.toString();
//        System.out.println(twoF);
//         
//        //MAP
//        Map area = new Map();
//        area.setRow(1);
//        area.setColumn(2);
//       
//        
//        //LOCATION
//        Location place = new Location();
//        place.setRow("1");
//        place.setColumn("2");
//        
//
//        String LocationPlace = place.toString();
//        System.out.println(place);
//        
//        //ITEM
//        Item foodOne = new Item();  
//            foodOne.setName("apple");
//            foodOne.setHp(20);
//            
//             String ItemFoodOne = foodOne.toString();
//             System.out.println(foodOne);
//             
//        Item foodTwo = new Item();  
//            foodTwo.setName("posion");
//            foodTwo.setHp(-20);
//            
//             String ItemFoodTwo = foodTwo.toString();
//             System.out.println(foodTwo);
//             
//             
//        //SCENE
//        Scene goodOne = new Scene();
//            goodOne.setGoodEncounter("Recover Health");
//            
//                String SceneGoodOne =goodOne.toString();
//                 System.out.println(goodOne);
//             
//         Scene goodTwo = new Scene();
//            goodTwo.setGoodEncounter("Receive Item");
//            
//                String SceneGoodTwo =goodTwo.toString();
//                System.out.println(goodTwo);   
//             
//        Scene badOne = new Scene();
//            badOne.setBadEncounter("Caught in a trap");
//            
//                String SceneBadOne=badOne.toString();
//                System.out.println(badOne);
//         
//        Scene badTwo = new Scene();
//            badTwo.setBadEncounter("Come to an illness");
//                String SceneBadTwo=badTwo.toString();
//                System.out.println(badTwo);
//                
//                
//        //INVENTORY
//              
//        Item[] inventory = new Item[6];
//        inventory[0] = new Item("Apple", 3);
//        inventory[1] = new Item("Muffin", 5);
//        inventory[2] = new Item("Blue Berry", 7);
//        inventory[3] = new Item("Pear", 7);
//        inventory[4] = new Item("Fish", 12);
//        inventory[5] = new Item("Herb", 2);
//        
//        
//        for (int i = 0; i < inventory.length; i++) {
//            System.out.println(inventory[i].getName() + " HP:" + inventory[i].getHp());
//        }
        
//        Inventory[] = new Inventory[] {"Blue Berry", "Pear", "Banana"};

            
    }  

 
  
    public static Game getCurrentGame(){
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame){
        Hunger_Games.currentGame = currentGame;
    }
    
    public static Player getPlayer(){
        return player;
    }
    
    public static void setPlayer(Player player){
        Hunger_Games.player = player;
    }
}
