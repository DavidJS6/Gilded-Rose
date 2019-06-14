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
public class DefaultStrategy extends GildedRoseTemplate implements GildedRoseStrategy {

    private final int QUALITY_LOST_PER_DAY = 1;
    
    @Override
    public void updateItemQuality(Item item) {
        /*
        int qualityValue = 1;
        
        if(item.sellIn < 0){
            qualityValue = qualityValue * 2;
        }
        
        while(item.quality < 50 && qualityValue > 0){
            item.quality -= 1;
            qualityValue--;
        }
        */

        updateQuality(item);
    }

    @Override
    public void modifyQuality(Item item) {
        if(isQualityOverMinValue(item)) {
            item.quality -= QUALITY_LOST_PER_DAY;
        }
    }

    @Override
    public void reduceSellDate(Item item) {
        item.sellIn -= 1;
    }

    @Override
    public void modifyQualityAfterSellDateReduced(Item item) {
        if(isQualityOverMinValue(item)) {
            item.quality -= QUALITY_LOST_PER_DAY;
        }
    }
}
