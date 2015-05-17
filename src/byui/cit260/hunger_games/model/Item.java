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
public class Item implements Serializable{
     private String name;
     private int hp;

    public Item() {
    }
    
    public Item(String myName, int myHP) {
        this.name = myName;
        this.hp = myHP;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", hp=" + hp + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.hp;
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.hp != other.hp) {
            return false;
        }
        return true;
    }
 
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
}
