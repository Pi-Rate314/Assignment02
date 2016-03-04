package assignment02;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rares
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE Karel = new RobotSE(kw, 3, 0, Direction.EAST);
        new Wall(kw, 3, 0, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 0, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 8, Direction.SOUTH);
        new Thing(kw, 3, 8);

        while(!Karel.canPickThing()){
        if (!Karel.frontIsClear()) {

            Karel.turnLeft();
            Karel.move();
            Karel.turnRight();
            Karel.move();
            Karel.turnRight();
            Karel.move();
            Karel.turnLeft();

        }
        if (Karel.frontIsClear()){
            Karel.move();
        }
        }
    }
}
        
        

    
    
        

  
