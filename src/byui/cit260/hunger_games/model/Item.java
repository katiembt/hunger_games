/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author katherineblake
 */
public enum Item implements Serializable{
  
    itemOne("apple"),
    itemTwo("berry"),
    itemThree("lemon"),
    itemFour("mushroom");
    
    
    private final String food;


    Item(String food) {
        
        this.food = food;
    }

    public String getFood() {
        return food;
    }


}
