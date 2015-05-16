/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.model;

import java.util.Objects;

/**
 *
 * @author WINGU
 */
public class Scene {
    private String goodEncounter;
    private String badEncounter;

    public Scene() {
    }

    @Override
    public String toString() {
        return "Scene{" + "goodEncounter=" + goodEncounter + ", badEncounter=" + badEncounter + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.goodEncounter);
        hash = 79 * hash + Objects.hashCode(this.badEncounter);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.goodEncounter, other.goodEncounter)) {
            return false;
        }
        if (!Objects.equals(this.badEncounter, other.badEncounter)) {
            return false;
        }
        return true;
    }

    
    
    public String getGoodEncounter() {
        return goodEncounter;
    }

    public void setGoodEncounter(String goodEncounter) {
        this.goodEncounter = goodEncounter;
    }

    public String getBadEncounter() {
        return badEncounter;
    }

    public void setBadEncounter(String badEncounter) {
        this.badEncounter = badEncounter;
    }
    
    
}
