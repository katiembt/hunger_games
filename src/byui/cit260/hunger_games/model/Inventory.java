/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author katherineblake
 */
public class Inventory implements Serializable{
    
     private Item[] arrayInventory;

    public Inventory() {
    }

    @Override
    public String toString() {
        return "Inventory{" + "arrayInventory=" + arrayInventory + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Arrays.deepHashCode(this.arrayInventory);
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
        final Inventory other = (Inventory) obj;
        if (!Arrays.deepEquals(this.arrayInventory, other.arrayInventory)) {
            return false;
        }
        return true;
    }
     
     

    public Item[] getArrayInventory() {
        return arrayInventory;
    }

    public void setArrayInventory(Item[] arrayInventory) {
        this.arrayInventory = arrayInventory;
    }
     
     
    
 
}
