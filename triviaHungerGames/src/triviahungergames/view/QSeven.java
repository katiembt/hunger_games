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
public class QSeven extends View {
       public QSeven() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Four Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| How old was Katniss when her       |"      
            +"\n| father died?                                  |"      
            +"\nA - 10"
            +"\nB - 15"
            +"\nC - 8 "
            +"\nD - 11"
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
        QEight qEight = new QEight();
        qEight.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}



