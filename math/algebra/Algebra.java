/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.algebra;

/**
 *
 * @author austen
 */
public class Algebra {
    private static final char[] TOKENS = {'/','*','+','^','-','1','2','3','4','5','6','7','8','9','0',' ',')','('};
    
    public static double equation(String equation, char var)
    {
        if (isLegalEquation(equation,var))
        {
            throw new IllegalArgumentException("Invalid character in equation");
        }
        return new Double(null);
    }
    
    private static boolean isLegalEquation(String equation, char exception)
    {
        char[] myArray = new char[TOKENS.length+1];
        for (int i = 0; i < TOKENS.length; i++)
        {
            myArray[i] = TOKENS[i];
        }
        myArray[myArray.length-1] = exception;
        for (Character token : TOKENS)
        {
            while(true)
            {
                if (equation.indexOf(token)==-1)
                {
                    break;
                }
                String first = "";
                String last = "";
                //Check if token is last...
                if (equation.indexOf(token)==equation.length()-1)
                {
                    equation = equation.substring(equation.indexOf(token));
                    continue;
                }
                last = equation.substring(equation.indexOf(token+1));
                if (equation.indexOf(token)==0)
                {
                    equation = equation.substring(1);
                    continue;
                }
                first = equation.substring(0,equation.indexOf(token));
                equation = first + last;
            }
            if (equation.equals(""))
            {
                return true;
            }
        }
        return false;
    }
}
