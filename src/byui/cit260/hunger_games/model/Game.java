/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.model;

import java.io.Serializable;

/**
 *
 * @author WINGU
 */
public class Game implements Serializable {
    
    private Map map;
    private Player player;
    
    private Item[] food = null;

    public Game() {
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Item[] getFood() {
        return food;
    }

    public void setFood(Item[] food) {
        this.food = food;
    }

    
    
}
