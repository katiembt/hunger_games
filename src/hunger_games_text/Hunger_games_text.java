/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunger_games_text;

import byui.cit260.hunger_games.model.Inventory;
import byui.cit260.hunger_games.model.Item;
import byui.cit260.hunger_games.model.Location;
import byui.cit260.hunger_games.model.Map;
import byui.cit260.hunger_games.model.Player;
import byui.cit260.hunger_games.model.Scene;
import byui.cit260.hunger_games.model.Tributes;

/**
 *
 * @author WINGU 
 * @author katherineblake
 * 
 */
public class Hunger_games_text {

    public static void main(String[] args){
        //Player
       Player created = new Player();
       created.getName();
       
        
        
        //Tribute one Male
    Tributes oneM = new Tributes();
        oneM.setName("Jett");
        oneM.setGender("male");
        oneM.setDistrict("District 1");
        oneM.setSkills("poison daggers");
        oneM.setHealthPoints(150);
        oneM.setStrength(20);

        String TributesIOneM = oneM.toString();
        System.out.println(oneM);
        
         //Tribute one female
     Tributes oneF = new Tributes();
        oneF.setName("Scarlett");
        oneF.setGender("female");
        oneF.setDistrict("District 1");
        oneF.setSkills("whip");
        oneF.setHealthPoints(150);
        oneF.setStrength(20);

        String TributesOneF = oneF.toString();
        System.out.println(oneF);
        
       //Tribute two Male
     Tributes twoM = new Tributes();
        twoM.setName("Mako");
        twoM.setGender("male");
        twoM.setDistrict("District 2");
        twoM.setSkills("iron rod");
        twoM.setHealthPoints(100);
        twoM.setStrength(15);
        
        String TributesTwoM = twoM.toString();
        System.out.println(twoM);
        
         //Tribute two female
     Tributes twoF = new Tributes();
        twoM.setName("Angel");
        twoM.setGender("");
        twoM.setDistrict("District 2");
        twoM.setSkills("brick");
        twoM.setHealthPoints(95);
        twoM.setStrength(15);

        String TributesTwoF = twoF.toString();
        System.out.println(twoF);
         
        //MAP
        Map area = new Map();
        area.setRow(1);
        area.setColumn(2);
       
        
        //LOCATION
        Location place = new Location();
        place.setRow("1");
        place.setColumn("2");
        

        String LocationPlace = place.toString();
        System.out.println(place);
        
        //ITEM
        Item foodOne = new Item();  
            foodOne.setName("apple");
            foodOne.setHp(20);
            
             String ItemFoodOne = foodOne.toString();
             System.out.println(foodOne);
             
        Item foodTwo = new Item();  
            foodTwo.setName("posion");
            foodTwo.setHp(-20);
            
             String ItemFoodTwo = foodTwo.toString();
             System.out.println(foodTwo);
        
        //INVENTORY
              
        Item[] inventory = new Item[6];
        inventory[0] = new Item("Apple", 3);
        inventory[1] = new Item("Muffin", 5);
        inventory[2] = new Item("Blue Berry", 7);
        inventory[3] = new Item("Pear", 7);
        inventory[4] = new Item("Fish", 12);
        inventory[5] = new Item("Herb", 2);
        
        
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i].getName() + " HP:" + inventory[i].getHp());
        }
        
//        Inventory[] = new Inventory[] {"Blue Berry", "Pear", "Banana"};

            
    }  
    
}
