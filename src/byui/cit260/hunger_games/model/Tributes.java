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
  
    Kat("Female","District 01","fighting skills",34,34,new Point (1,2)),
    Atticus("Male","District 01","fighting skills",34,34,new Point (1,2)),
    Alice("female","District 02","fighting skills",34,34,new Point (1,2)),
    Axel("Male","District 02","fighting skills",34,34,new Point (1,2)),
    Artemis("Female","District 03","fighting skills",34,34,new Point (1,2)),
    Jack("Male","District 03","fighting skills",34,34,new Point (1,2)),
    Hana("Female","District 04","fighting skills",34,34,new Point (1,2)),
    Mako("Male","District 04","fighting skills", 34,34,new Point (1,2)),
    Sapphire("Female","District 05","fighting skills", 34,34,new Point (1,2)),
    Sterling("Male","District 05","fighting skills", 4,34,new Point (1,2)),
    Jade("Female","District 06","fighting skills", 34,34,new Point (1,2)),
    Lance("Male","District 06","fighting skills", 4,34,new Point (1,2)),
    Kaguya("Female","District 07","fighting skills",34,34,new Point (1,2)),
    Drew("Male","District 07","fighting skills",34,34,new Point (1,2)),
    Layla("female","District 08","fighting skills",34,34,new Point (1,2)),
    Roy("Male","District 08","fighting skills",34,34,new Point (1,2)),
    Melody("Female","District 09","fighting skills",34,34,new Point (1,2)),
    Wallace("Male","District 09","fighting skills",34,34,new Point (1,2)),
    Diantha("Female","District 10","fighting skills",34,34,new Point (1,2)),
    Zane("Male","District 10","fighting skills", 34,34,new Point (1,2)),
    Iris("Female","District 11","fighting skills", 34,34,new Point (1,2)),
    Blake("Male","District 11","fighting skills", 4,34,new Point (1,2)),
    Mavis("Female","District 12","fighting skills", 34,34,new Point (1,2)),
    Bartholomew("Male","District 12","fighting skills", 4,34,new Point (1,2));
    
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
     @Override
    public String toString() {
        return "Tributes{" + " district=" + district + ", skills=" + skills + ", strength=" + strength + ", gender=" + gender + ", healthPoints=" + healthPoints + ", coordinates=" + coordinates + '}';
    }
}


    
    

     
 
