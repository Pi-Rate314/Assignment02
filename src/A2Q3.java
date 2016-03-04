/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author rares
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    City kw = new City();
    RobotSE Karel = new RobotSE (kw,7,3,Direction.WEST);
    
    if(Karel.getDirection() == Direction.SOUTH){
        Karel.turnRight();
    }
    if(Karel.getDirection() == Direction.EAST){
        Karel.turnLeft();
    }
    
    if(Karel.getDirection() == Direction.WEST){
        Karel.turnRight();
    }
    while(Karel.getStreet() >= 0){
        Karel.move();
        if(Karel.getStreet() == 0){
            break;
        }
    }
    if(Karel.getDirection() != Direction.WEST){
        Karel.turnLeft();
    }
    while(Karel.getAvenue() >= 0){
        Karel.move();
        if(Karel.getAvenue() == 0){
            break;
        }
    }
    if(Karel.getStreet() == 0 && Karel.getAvenue() == 0){
        if(Karel.getDirection() == Direction.WEST){
        Karel.turnRight();
        Karel.turnRight();
    }
    
    }
    
    
    }
    
}
