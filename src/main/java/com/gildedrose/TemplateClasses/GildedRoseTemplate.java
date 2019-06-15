package com.gildedrose.TemplateClasses;

import com.gildedrose.Item;

public abstract class GildedRoseTemplate {

    private final int MAX_QUALITY_VALUE_NO_LEGENDARY = 50;
    private final int MIN_QUALITY_VALUE = 0;

    protected void updateQuality(Item item){
        modifyQuality(item);
        reduceSellDate(item);
        if(item.sellIn < 0) {
            modifyQualityAfterSellDateReduced(item);
        }
    }
    
    protected void increasyQuality(Item item, int value){
        for(int i = value; i > 0; i--) {
            if(isQualityBelowMaxValue(item)){
                item.quality += 1;
            }
        }
    }
    
    protected void decreasyQuality(Item item, int value){
        for(int i = value; i > 0; i--) {
            if (isQualityOverMinValue(item)) {
                item.quality -= 1;
            }
        }
    }

    protected boolean isQualityBelowMaxValue(Item item){
        return item.quality < MAX_QUALITY_VALUE_NO_LEGENDARY;
    }

    protected boolean isQualityOverMinValue(Item item){
        return item.quality > MIN_QUALITY_VALUE;
    }

    public abstract void modifyQuality(Item item);
    public abstract void reduceSellDate(Item item);
    public abstract void modifyQualityAfterSellDateReduced(Item item);

}
