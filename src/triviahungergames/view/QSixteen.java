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
public class QSixteen extends View{
       public QSixteen() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Six Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| WILDCARD: What was the distance between the   |"      
            +"\n| trackerjacker hive and Katniss and Peeta's    |"
            +"\n| hideout?  Trackerjacker Coordinates: (01, 36) |"
            +"\n| Katniss and peeta Hideout: (90, 172)          |"  
            +"\n|                                               |"        
            +"\nA - 188.1"
            +"\nB - 136.2"
            +"\nC - 162.5 "
            +"\nD - 96"
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
                this.viewNextQuestion();
                break;
            case 'D':
            case 'd':
                this.viewDied();
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
        QSeventeen qSeventeen = new QSeventeen();
        qSeventeen.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}





