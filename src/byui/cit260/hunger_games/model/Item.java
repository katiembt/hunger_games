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
  
    itemOne("","apple"),
    itemTwo("knife",""),
    itemThree("knife","apple"),
    itemFour("knife","apple");
    
    private final String weapon;
    private final String food;




    Item(String weapon, String food) {
        this.weapon = weapon;
        this.food = food;
    }


    public String getWeapon() {
        return weapon;
    }

    public String getFood() {
        return food;
    }


}
