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
public class BackstagePassStrategy extends GildedRoseTemplate implements GildedRoseStrategy {

    private final int NORMAL_QUALITY_OBTAINED_PER_DAY = 1;
    private final int AMOUNT_OF_DAYS_BEFORE_DOUBLE = 11;
    private final int AMOUNT_OF_DAYS_BEFORE_TRIPLE = 6;

    @Override
    public void updateItemQuality(Item item) {
        updateQuality(item);
    }

    @Override
    public void modifyQuality(Item item) {
        int qualityAdded = NORMAL_QUALITY_OBTAINED_PER_DAY;
        if (item.sellIn <= AMOUNT_OF_DAYS_BEFORE_DOUBLE) {
            qualityAdded = 2;
        }
        if (item.sellIn <= AMOUNT_OF_DAYS_BEFORE_TRIPLE) {
            qualityAdded = 3;
        }

        for(int i = qualityAdded; i > 0; i--) {
            if (isQualityBelowMaxValue(item)) {
                item.quality += 1;
            }
        }
    }

    @Override
    public void reduceSellDate(Item item) {
        item.sellIn -= 1;
    }

    @Override
    public void modifyQualityAfterSellDateReduced(Item item) {
        item.quality = 0;
    }
}
