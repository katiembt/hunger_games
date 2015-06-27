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
 * @author WINGU
 */
public class Player implements Serializable{
    
     private String name;
    private String gender;
    private String district;
    private String skills;
    private int healthPoints;
    private int strength;

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", gender=" + gender + ", district=" + district + ", skills=" + skills + ", healthPoints=" + healthPoints + ", strength=" + strength + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.gender);
        hash = 83 * hash + Objects.hashCode(this.district);
        hash = 83 * hash + Objects.hashCode(this.skills);
        hash = 83 * hash + this.healthPoints;
        hash = 83 * hash + this.strength;
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.district, other.district)) {
            return false;
        }
        if (!Objects.equals(this.skills, other.skills)) {
            return false;
        }
        if (this.healthPoints != other.healthPoints) {
            return false;
        }
        if (this.strength != other.strength) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    
}