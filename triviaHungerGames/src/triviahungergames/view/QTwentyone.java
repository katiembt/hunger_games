/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.view;

/**
 *
 * @author katherineblake
 */
public class QTwentyone extends View{
     public QTwentyone() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Six Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| WILD CARD: Find the Midpoint between the Hive|"      
            +"\n| and the hideout to find out where           |" 
            +"\n| she got the aid from.                       |"
            +"\n|                                             |"   
            +"\n|Trackerjacker Coordinates: (01, 36)          |"  
            +"\n| District 12 Hideout: (90, 172)              |"     
             +"\n|                                            |"           
            +"\nA - (38.9 ,104)"
            +"\nB - (43.3 ,173)"
            +"\nC - (55 ,136) "
            +"\nD - (45.5, 104)"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'A':
            case 'a':
                this.viewDied();
                break;
            case 'B':
            case 'b':
                this.viewDied();
                break;
            case 'C':
            case 'c':
                this.viewDied();
                break;
            case 'D':
            case 'd':
                this.viewNextQuestion();
                break;   
            case 'R':
            case 'r':
                return false;
            default:
                System.out.println("\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }
    
    private void viewNextQuestion() {
        QTwentytwo qTwentytwo = new QTwentytwo();
        qTwentytwo.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}









