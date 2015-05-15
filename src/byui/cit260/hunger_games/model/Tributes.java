package byui.cit260.hunger_games.model;


import java.io.Serializable;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katherineblake
 */

public class Tributes implements Serializable{
    private String name;
    private int hp;
    private String skills;
    private int Strength;
    

    public Tributes() {
    }

    @Override
    public String toString() {
        return "Tributes{" + "name=" + name + ", hp=" + hp + ", skills=" + skills + ", Strength=" + Strength + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.hp;
        hash = 79 * hash + Objects.hashCode(this.skills);
        hash = 79 * hash + this.Strength;
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
        final Tributes other = (Tributes) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.hp != other.hp) {
            return false;
        }
        if (!Objects.equals(this.skills, other.skills)) {
            return false;
        }
        if (this.Strength != other.Strength) {
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

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int Strength) {
        this.Strength = Strength;
    }



}


    
    

     
 
