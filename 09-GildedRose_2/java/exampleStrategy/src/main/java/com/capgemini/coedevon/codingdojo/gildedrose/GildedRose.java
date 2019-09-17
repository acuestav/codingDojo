package com.capgemini.coedevon.codingdojo.gildedrose;

import java.util.List;

import com.capgemini.coedevon.codingdojo.gildedrose.item.Item;

class GildedRose {

  private List<Item> items;

  public GildedRose(List<Item> items) {
    this.items = items;
  }

  public void updateQuality() {

    for (Item item : this.items) {

      item.updateQuality();

    }

  }

}