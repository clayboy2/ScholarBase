/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.physics;

/**
 *
 * @author austen
 */
public class Physics {
    //Simple solvers for velocity, time, distance in 1D motion
    public static double findAccelration(double time, double velocity)
    {
        if (time<=0)
        {
            throw new IllegalArgumentException("Time must be a positive number above 0");
        }
        return velocity/time;
    }
    
    public static double findVelocity(double time, double distance)
    {
        if (time<=0)
        {
            throw new IllegalArgumentException("Time must be a positive number above 0");
        }
        return distance/time;
    }
    
    public static double findFinalVelocity(double initialVelocity, double time, double acceleration)
    {
        if (time<0)
        {
            throw new IllegalArgumentException("Time must be a greater than or equal to 0");
        }
        return initialVelocity+(acceleration*time);
    }
    
    public static double findFinalVelocity(double initialVelocity, double time, double changeDistance,boolean usingAlternateFormula)
    {
        if (time<0)
        {
            throw new IllegalArgumentException("Time must be greater than or equal to 0");
        }
        return ((initialVelocity*initialVelocity)+(2*acceleration*changeDistance));
    }
    
    public static double findChangeDistance(double initialVelocity, double time, double acceleration)
    {
        if (time<0)
        {
            throw new IllegalArgumentException("Time must be greater than or equal to 0");
        }
        return (initialVelocity*time)+((acceleration/time)*(time*time));
    }
    
}
