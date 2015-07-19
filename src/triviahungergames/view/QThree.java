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
public class QThree extends View {
     public QThree() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Two Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| Where did Katniss Everdeen grew up at?       |"      
            +"\nA - District 2, Adama"
            +"\nB - District 13, Panama"
            +"\nC - District 12, Panem "
            +"\nD - District 3, Panira"
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
            default:
                System.out.println("\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }
    
    private void viewNextQuestion() {
        QFour qFour = new QFour();
        qFour.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}


