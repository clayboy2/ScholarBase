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
public class PurchaseOrder {
    private Unit[] order;
    private int totalCost;
    private boolean isFilled;
    
    public PurchaseOrder(Unit[] order)
    {
        this.order = order;
        this.totalCost = 0;
        calculateCost();
        this.isFilled = false;
    }
    
    public boolean isFilled()
    {
        return this.isFilled;
    }
    
    public void calculateCost()
    {
        int cost = 0;
        for (Unit u : order)
        {
            cost += u.getCost();
        }
        this.totalCost = cost;
    }
    
    public void finalizeOrder()
    {
        this.isFilled = true;
    }
    
    public int getCost()
    {
        return this.totalCost;
    }
    
    public void setOrder(Unit[] order)
    {
        this.order = order;
    }
    
    public Unit[] getOrder()
    {
        return this.order;
    }
}
