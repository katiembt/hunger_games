package byui.cit260.hunger_games.model;


import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.Point;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katherineblake
 */

public enum Tributes implements Serializable{
  
    Kat("Female","District one","fighting skills",34,34,new Point (1,2)),
    Ken("Male","District one","fighting skills",34,34,new Point (1,2)),
    Alice("female","District two","fighting skills",34,34,new Point (1,2)),
    Axel("Male","District two","fighting skills",34,34,new Point (1,2)),
    Fiona("Female","District three","fighting skills",34,34,new Point (1,2)),
    Fred("Female","District three","fighting skills",34,34,new Point (1,2)),
    Lila("Female","District four","fighting skills",34,34,new Point (1,2)),
    Lary("Female","District four","fighting skills", 34,34,new Point (1,2)),
    Missy("Female","District five","fighting skills",  34,34,new Point (1,2)),
    Matt("Female","District five","fighting skills", 4,34,new Point (1,2));
    
    private final String gender;
    private final String district;
    private final String skills;
    private final int healthPoints;
    private final int strength;
    private final Point coordinates;


    Tributes(String gender, String district, String skills, int healthPoints, int strength, Point coordinates ) {
        this.gender = gender;
        this.district = district;
        this.skills = skills;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.coordinates = coordinates;
    }
    public String getGender() {
        return gender;
    }


    public String getDistrict() {
        return district;
    }

    public String getSkills() {
        return skills;
    }

   
    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrength() {
        return strength;
    }
    
     public Point getCoordinates() {
        return coordinates;
    }

}


    
    

     
 
