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
        updateQuality(item);
    }

    @Override
    public void modifyQuality(Item item) {
        System.out.println("This item cannot update its quality");
    }

    @Override
    public void reduceSellDate(Item item) {
        System.out.println("This item will never be sold");
    }

    @Override
    public void modifyQualityAfterSellDateReduced(Item item) {
        System.out.println("This item cannot update its quality");
    }
}
