/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author katherineblake
 */
public class Location implements Serializable{
   
     private int row;
     private int column;
     private Scene scene;
     private Item item;
    private Tributes tributes;

    public Location() {
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Tributes getTributes() {
        return tributes;
    }

    public void setTributes (Tributes tributes) {
        this.tributes = tributes;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.row);
        hash = 37 * hash + Objects.hashCode(this.column);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        return true;
    }
     
     

//    public String getRow() {
//        return row;
//    }
//
//    public void setRow(String row) {
//        this.row = row;
//    }
//
//    public String getColumn() {
//        return column;
//    }
//
//    public void setColumn(String column) {
//        this.column = column;
//    }
    
}
