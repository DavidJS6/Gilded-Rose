package com.gildedrose;

import com.gildedrose.StrategyClasses.AgedBrieStrategy;
import com.gildedrose.StrategyClasses.BackstagePassStrategy;
import com.gildedrose.StrategyClasses.ConjuredStrategy;
import com.gildedrose.StrategyClasses.Context;
import com.gildedrose.StrategyClasses.DefaultStrategy;
import com.gildedrose.StrategyClasses.SulfurasStrategy;
import com.gildedrose.StrategyClasses.GildedRoseStrategy;

class GildedRose {
    public Item[] items;

    private final String AGED_BRIE_VALUE = "Aged Brie";
    private final String BACKSTAGE_PASS_VALUE = "Backstage passes to a TAFKAL80ETC concert";
    private final String SULFURAS_VALUE = "Sulfuras, Hand of Ragnaros";
    private final String CONJURED_VALUE = "Conjured Mana Cake";

    /*
    * Tipos de comportamiento que se tienen:
    * Default: Por cada dia que pasa su valor quality se reduce en 1.
    * Aged Brie: Por cada dia que pasa su valor quality aumenta en 1
    * Sulfuras: Tienen una quality de 80 y no se reduce al igual que su valor sellIn
    * Backstage passes: Por cada dia que pasa su valor quality aumenta en 1, sin embargo cuando el valor
    *                   sellIn es igual o menor a 10 su valor quality aumenta en dos y cuando el valor de sellIn
    *                   es igual o menor a 5 su valor quality aumenta en tres, una vez que sellIn llega a 0
    *                   su quality se reduce a 0.
    * Conjured: Por cada dia que pasa su valor quality se reduce en 2.
    *
    *
    * Además se deben tomar en cuenta los siguientes puntos:
    * - Una vez que el valor sellIn es menor a 0 su quality se reduce el doble de lo normal.
    * - El valor quality de algun item nunca es negativo
    * - El valor quality de algun item nunca es mayor a 50, el objeto Sulfuras es la excepcion.
    *
    * */

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (Item item : items) {

            /*
            if (!item.name.equals(AGED_BRIE_VALUE) && !item.name.equals(BACKSTAGE_PASS_VALUE)) {
                if (item.quality > 0) {
                    if (!item.name.equals(SULFURAS_VALUE)) {
                        item.quality = item.quality - 1;
                    }
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (item.name.equals(BACKSTAGE_PASS_VALUE)) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                }
            }
            */
            
            if (!item.name.equals(SULFURAS_VALUE)) {
                item.sellIn = item.sellIn - 1;
            }
            
            
            /*
            int qualityValue;
            switch (item.name) {
                case AGED_BRIE_VALUE:
                    qualityValue = 1;
                    break;
                case BACKSTAGE_PASS_VALUE:
                    qualityValue = 1;
                    if(item.sellIn < 11){
                        qualityValue = 2;
                    }
                    if(item.sellIn < 6){
                        qualityValue = 3;
                    }
                    if(item.sellIn < 0){
                        qualityValue = item.quality * -1;
                    }
                    break;
                case SULFURAS_VALUE:
                    qualityValue = 0;
                    break;
                case CONJURED_VALUE:
                    qualityValue = -2;
                    break;
                default:
                    qualityValue = -1;
                    break;
            }
            
            if(item.sellIn < 0){
                qualityValue = qualityValue * 2;
            }
            
            item.quality += qualityValue;
            
            if(item.quality < 0){
                item.quality = 0;
            }
            if(item.quality > 50 && !item.name.equals(SULFURAS_VALUE)){
                item.quality = 50;
            }
            */

            Context context = new Context();
            switch (item.name) {
                case AGED_BRIE_VALUE:
                    context.setStrategy(new AgedBrieStrategy());
                    break;
                case BACKSTAGE_PASS_VALUE:
                    context.setStrategy(new BackstagePassStrategy());
                    break;
                case SULFURAS_VALUE:
                    context.setStrategy(new SulfurasStrategy());
                    break;
                case CONJURED_VALUE:
                    context.setStrategy(new ConjuredStrategy());
                    break;
                default:
                    context.setStrategy(new DefaultStrategy());
                    break;
            }            
            context.executeStrategy(item);


            /*
            if (item.sellIn < 0) {
                if (!item.name.equals(AGED_BRIE_VALUE)) {
                    if (!item.name.equals(BACKSTAGE_PASS_VALUE)) {
                        if (item.quality > 0) {
                            if (!item.name.equals(SULFURAS_VALUE)) {
                                item.quality = item.quality - 1;
                            }
                        }
                    } else {
                        item.quality = 0;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
            */

        }

    }
}