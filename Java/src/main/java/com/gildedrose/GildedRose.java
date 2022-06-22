package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    	public void updateQuality() {
            for (Item item : items) {
                ItemCategory category = categorize(item);
                category.updateOneItem(item);
            }
        }
    	
        private ItemCategory categorize(Item item) {
           if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                return new Legendary();
            }
            if (item.name.equals("Aged Brie")) {
                return new Cheese();
            }
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                return new BackstagePass();
            }
            if (item.name.startsWith("Conjured")) {
            	return new Conjured();
            }
                
            return new ItemCategory();
        }

  
}