/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.axisandallies;

/**
 *
 * @author austen
 */
public enum Unit {
    //Define choices
    INFANTRY (3,1,1,2),
    ARMOR (5,2,3,2),
    FIGHTER (12,4,3,4),
    BOMBER (15,6,4,1),
    ANTIAIRCRAFT (5,1,0,1),
    BATTLESHIP (24,2,4,4),
    AIRCRAFT_CARRIER (18,2,1,3),
    TRANSPORT (8,2,0,1),
    SUBMARINE (8,2,2,2),
    INDUSTRIAL_COMPLEX (15,0,0,0);
    
    //Class Variables
    private final int cost;
    private final int movement;
    private final int attack;
    private final int defense;
    
    //Constructor
    Unit(int cost, int movement, int attack, int defense)
    {
        this.cost = cost;
        this.movement = movement;
        this.attack = attack;
        this.defense = defense;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public int getMovement()
    {
        return movement;
    }
    
    public int getAttack()
    {
        return attack;
    }
    
    public int getDefense()
    {
        return defense;
    }
}
