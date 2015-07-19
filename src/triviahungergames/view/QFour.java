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
public class QFour extends View {
     public QFour() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Two Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| How did Katniss Everdeen keep her family |"  
            +"\n| after her father died? |"             
            +"\nA - Works in the mines instead of him"
            +"\nB - Go hunting and sells some of her good hunts at the Hob"
            +"\nC -  Flirting with random wealthy men "
            +"\nD - Beggar"
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
        QFive qFive = new QFive();
        qFive.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}


