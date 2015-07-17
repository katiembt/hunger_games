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
public class QTwo extends View {
    
        public QTwo() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District One Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| What did Governor of District 2, Gale       |"
            +"\n| Hawthorne, nickname Katniss Everdeen?   |"        
            +"\nA - KissLips"
            +"\nB - Katie"
            +"\nC - Catnip"
            +"\nD - Katana"
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
        QThree qThree = new QThree();
        qThree.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }

}
