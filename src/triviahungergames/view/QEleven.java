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
public class QEleven extends View{
       public QEleven() {
            super("\n"
            +"\n-------------------------------------------------"
            +"\n| District Six Tribute                          |"
            +"\n-------------------------------------------------"
            +"\n| WILD CARD:  You now have to calculate the     |"      
            +"\n| distance of when Katniss went from start      |" 
            +"\n|  area to her first hiding spot:               |" 
            +"\n|                                               |" 
            +"\n| If we were using straight lines, her movement |" 
            +"\n| was 2003 yards north by 3600 yards east.      |"  
            +"\n| What was the diagonal and actual distance she |" 
            +"\n| took to get there?                            |"         
            +"\nA - 16972009"
            +"\nB - 4119.7"
            +"\nC - 2857.5 "
            +"\nD - 2960.2"
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
                 this.viewNextQuestion();
                break;
            case 'C':
            case 'c':
                this.viewDied();
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
        QTwelve qTwelve = new QTwelve();
        qTwelve.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}




