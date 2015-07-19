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
public class Win extends View{
      public Win() {
            super("\n"
            +"\n----------------------------------------------"
            +"\n| YOU HAVE WON!!                   |"
            +"\n----------------------------------------------"
            +"\n| Congrats!          |"      
            +"\n|                                             |"      
            +"\nA - View Katniss Bio"
            +"\nB -  Return to main Menu"
            +"\nC - DO NOT CLICK(FILLER)"
            +"\n----------------------------------------------");
            
        }
        
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'A':
            case 'a':
                this.viewFallenTributes();
                break;
            case 'B':
            case 'b':
                this.viewMainMenu();
                break;
            case 'C':
            case 'c':
                this.viewFallenTributes();
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
    private void viewFallenTributes() {
        FallenTributes fallenTributes = new FallenTributes();
        fallenTributes.display();
    }

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}











