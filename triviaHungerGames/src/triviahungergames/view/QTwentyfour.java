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
public class QTwentyfour extends View {

    public QTwentyfour() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| District Six Tribute                        |"
                + "\n----------------------------------------------"
                + "\n| Who did Katniss marry?           |"
                + "\n|                                             |"
                + "\nA - Gale Hawthorne"
                + "\nB - Peeta Mallark"
                + "\nC - She did not marry "
                + "\nD - Finnick Odair"
                + "\n----------------------------------------------");

    }

    @Override
    public boolean doAction(Object obj) {

        char selection = (char) obj;

        switch (selection) {
            case 'A':
            case 'a':
                this.viewDied();
                break;
            case 'B':
            case 'b':
                this.viewWin();
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

    private void viewWin() {
        Win win = new Win();
        win.display();
    }

    private void viewDied() {
        Died died = new Died();
        died.display();
    }

}
