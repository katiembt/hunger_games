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
 * @author WINGU
 */
public enum Scene implements Serializable{
  
    Swamp("Swamp",new Point (1,1),"Kat"),
    Lake("Lake",new Point (1,3),"Lary"),
    Forest("Forest",new Point (1,4),"Fred"),
    Mountain("Mountain",new Point (1,5),"Fiona");
    
    private final String location;
    private final Point coordinates;
    private final String tribute;



    Scene(String location, Point coordinates, String tribute) {
        this.location = location;
        this.tribute = tribute;
        this.coordinates = coordinates;
    }


    public String getLocation() {
        return location;
    }

    public String getTribute() {
        return tribute;
    }

     public Point getCoordinates() {
        return coordinates;
    }

}


    
    

     
 
