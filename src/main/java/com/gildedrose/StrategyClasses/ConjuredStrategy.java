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
public class ConjuredStrategy extends GildedRoseTemplate implements GildedRoseStrategy {

    private final int QUALITY_LOST_PER_DAY = 2;

    @Override
    public void updateItemQuality(Item item) {
        /*
        int qualityValue = 2;
        
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
        for(int i = QUALITY_LOST_PER_DAY; i > 0; i--) {
            if (isQualityOverMinValue(item)) {
                item.quality -= 1;
            }
        }
    }

    @Override
    public void reduceSellDate(Item item) {
        item.sellIn -= 1;
    }

    @Override
    public void modifyQualityAfterSellDateReduced(Item item) {
        for(int i = QUALITY_LOST_PER_DAY; i > 0; i--) {
            if (isQualityOverMinValue(item)) {
                item.quality -= 1;
            }
        }
    }
}
