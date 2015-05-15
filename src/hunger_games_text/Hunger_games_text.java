/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunger_games_text;

import byui.cit260.hunger_games.model.Tributes;

/**
 *
 * @author WINGU 
 * @author katherineblake
 * 
 */
public class Hunger_games_text {

    public static void main(String[] args){
        //Tribute one Male
    Tributes oneM = new Tributes();
        oneM.setName("jett");
        oneM.setHp(150);
        oneM.setSkills("dagger");
        oneM.setStrength(5);

        String TributesIOneM = oneM.toString();
        System.out.println(oneM);
        
         //Tribute one female
     Tributes oneF = new Tributes();
        oneF.setName("molly");
        oneF.setHp(45);
        oneF.setSkills("sword");
        oneF.setStrength(5);

        String TributesOneF = oneF.toString();
        System.out.println(oneF);
        
       //Tribute two Male
     Tributes twoM = new Tributes();
        twoM.setName("Steve");
        twoM.setHp(45);
        twoM.setSkills("sword");
        twoM.setStrength(5);
        
        String TributesTwoM = twoM.toString();
        System.out.println(twoM);
        
         //Tribute two female
     Tributes twoF = new Tributes();
        twoF.setName("Allie");
        twoF.setHp(45);
        twoF.setSkills("sword");
        twoF.setStrength(5);

        String TributesTwoF = twoF.toString();
        System.out.println(twoF);
    }  
    
}
