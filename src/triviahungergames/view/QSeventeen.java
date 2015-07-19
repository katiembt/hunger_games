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
public class QSeventeen extends View{
       public QSeventeen() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| District Six Tribute                        |"
            +"\n----------------------------------------------"
            +"\n| What nickname is Cina give Katniss  ?       |"      
            +"\n|                                             |"      
            +"\nA - The Girl on Fire"
            +"\nB - The Girl in Flames"
            +"\nC - This Girl is on Fire "
            +"\nD - Catnip"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'A':
            case 'a':
                this.viewNextQuestion();
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
        QEighteen qEighteen = new QEighteen();
        qEighteen.display();
    }
      private void viewDied() {
        Died died = new Died();
        died.display();
    }
                   
 
    
}





