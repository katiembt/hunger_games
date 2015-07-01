/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hunger_games.model;

import java.io.Serializable;

/**
 *
 * @author WINGU
 */
public class Map implements Serializable{
    private int row;   
    private int column;
    private Location [][] locations;
    private int numrow;   
    private int numcolumn;

    public Map() {
    }

       public Map(int numRow, int numColumn) {
        
        if (numRow < 1 || numColumn < 1) {
            System.out.println("The number of columns and rows must be > than 0");
            return;
        }

        this.row = numRow;
        this.column = numColumn;
                
        this.locations = new Location [numRow][numColumn];
        
        for (int row = 0; row < row; row++) {
            for (int column = 0; column < numColumn; column++) {
                
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
        
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    } 
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "row=" + row + ", column=" + column + ", locations=" + locations + ", numRow=" + numRow + ", numColumn=" + numColumn + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
        hash = 79 * hash + Arrays.deepHashCode(this.locations);
        hash = 79 * hash + this.numRow;
        hash = 79 * hash + this.numColumn;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (this.numRow != other.numRow) {
            return false;
        }
        if (this.numColumn != other.numColumn) {
            return false;
        }
        return true;
    }

}
