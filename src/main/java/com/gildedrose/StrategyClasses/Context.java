/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.StrategyClasses;

import com.gildedrose.Item;

/**
 *
 * @author Sandoval-PC
 */
public class Context {
    
    private GildedRoseStrategy strategy;
    
    public void setStrategy(GildedRoseStrategy strategy){
        this.strategy = strategy;
    }
    
    public void executeStrategy(Item item){
        this.strategy.updateItemQuality(item);
    }
    
}
