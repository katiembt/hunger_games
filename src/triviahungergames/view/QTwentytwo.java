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
public class QTwentytwo extends View{
     public QTwentytwo() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Six Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| What is Katniss's favorite Time of year?    |"      
            +"\n|                                             |"      
            +"\nA - Late Winter"
            +"\nB - Mid Summer"
            +"\nC - Early Winter "
            +"\nD - Early Spring"
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
        QTwentythree qTwentythree = new QTwentythree();
        qTwentythree.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}









