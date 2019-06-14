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
public class SulfurasStrategy implements GildedRoseStrategy {
    
    @Override
    public void updateItemQuality(Item item) {        
        
        System.out.println("This item cannot update its quality");
        
        /*
        int qualityValue = 0;
        
        if(this.item.sellIn < 0){
            qualityValue = qualityValue * 2;
        }
        
        while(item.quality < 50 && qualityValue > 0){
            this.item.quality += 1;
            qualityValue--;
        }
        */
    }
    
}
