/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.StrategyClasses;

import com.gildedrose.Item;
import com.gildedrose.TemplateClasses.GildedRoseTemplate;

/**
 *
 * @author Sandoval-PC
 */
public class SulfurasStrategy extends GildedRoseTemplate implements GildedRoseStrategy {
    
    @Override
    public void updateItemQuality(Item item) {
        
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
        updateQuality(item);
    }

    @Override
    public void modifyQuality(Item item) {
        System.out.println("This item cannot update its quality");
    }

    @Override
    public void reduceSellDate(Item item) {
        System.out.println("This item will never be selled");
    }

    @Override
    public void modifyQualityAfterSellDateReduced(Item item) {
        System.out.println("This item cannot update its quality");
    }
}
