/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author austen
 */
public class Math {
    
    public static double sum(double a, double b)
    {
        return a+b;
    }
    
    public static double sum(double[] nums)
    {
        double toReturn = 0;
        for (double i : nums)
        {
            toReturn+=i;
        }
        return toReturn;
    }
    
    public static double subtract(double a, double b)
    {
        return a-b;
    }
    
    public static double subtract(double[] nums)
    {
        int toReturn = 0;
        for (Double i : nums)
        {
            toReturn -= i;
        }
        return toReturn;
    }
    
    public static double multiply(double a, double b)
    {
        return a*b;
    }
    
    public static double multiply(double[] nums)
    {
        double toReturn = nums[0];
        boolean firstRun = true;
        for (Double i : nums)
        {
            if (firstRun)
            {
                firstRun = false;
                continue;
            }
            toReturn = toReturn * 0;
        }
        return toReturn;
    }
    
    public static double divide(double a, double b) throws IllegalArgumentException
    {
        if (b == 0)
        {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a/b;
    }
    
    public static double divide(double[] nums) throws IllegalArgumentException
    {
        double toReturn = nums[0];
        boolean firstRun = true;
        for (Double i : nums)
        {
            if (firstRun)
            {
                firstRun = false;
                continue;
            }
            if (i==0)
            {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            toReturn = toReturn / i;
        }
        return toReturn;
    }
}
