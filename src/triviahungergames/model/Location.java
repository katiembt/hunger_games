/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviahungergames.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author katherineblake
 */
public class Location implements Serializable {

    private int row;
    private int column;
    private boolean visited;



    public Location() {
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }



    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited +  '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.row;
        hash = 83 * hash + this.column;
        hash = 83 * hash + (this.visited ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }

        return true;
    }
}
//public class Location implements Serializable{
//   
//     private int row;
//     private int column;
//
//
//    public Location() {
//    }
//    
//    public int getRow() {
//        return row;
//    }
//
//    public void setRow(int row) {
//        this.row = row;
//    }
//
//    public int getColumn() {
//        return column;
//    }
//
//    public void setColumn(int column) {
//        this.column = column;
//    }
//    
//    
//    
//    @Override
//    public String toString() {
//        return "Location{" + "row=" + row + ", column=" + column + '}';
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 37 * hash + Objects.hashCode(this.row);
//        hash = 37 * hash + Objects.hashCode(this.column);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Location other = (Location) obj;
//        if (!Objects.equals(this.row, other.row)) {
//            return false;
//        }
//        if (!Objects.equals(this.column, other.column)) {
//            return false;
//        }
//        return true;
//    }
//     
//     
//
////    public String getRow() {
////        return row;
////    }
////
////    public void setRow(String row) {
////        this.row = row;
////    }
////
////    public String getColumn() {
////        return column;
////    }
////
////    public void setColumn(String column) {
////        this.column = column;
////    }
//    
//}
