/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose;

/**
 *
 * @author Sandoval-PC
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 11, 46),
                new Item("Backstage passes to a TAFKAL80ETC concert", 6, 46),
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49),
                new Item("Aged Brie", 1, 0),
                new Item("Conjured Mana Cake", 1, 6),
                new Item("Aged Brie", 0, 0),
                new Item("Conjured Mana Cake", 0, 6),
                new Item("Conjured Mana Cake", -2, 6),
                new Item("Backstage passes to a TAFKAL80ETC concert", 4, 42),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 45),
                new Item("Aged Brie", -4, 10), //
                new Item("Elixir of the Mongoose", -2, 7), //
                new Item("Sulfuras, Hand of Ragnaros", -10, 80),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }
    
}
