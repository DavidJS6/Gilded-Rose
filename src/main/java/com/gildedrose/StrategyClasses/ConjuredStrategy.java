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
public class ConjuredStrategy implements GildedRoseStrategy {
    
    @Override
    public void updateItemQuality(Item item) {
        int qualityValue = 2;
        
        if(item.sellIn < 0){
            qualityValue = qualityValue * 2;
        }
        
        while(item.quality < 50 && qualityValue > 0){
            item.quality -= 1;
            qualityValue--;
        }
    }
}
