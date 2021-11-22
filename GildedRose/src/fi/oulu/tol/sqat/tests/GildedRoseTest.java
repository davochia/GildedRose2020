package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {
	
	

	@Test
	public void testTheTruth() {
		System.out.println("OMGHAI!");

		assertTrue(true);
	}
	@Test
	public void exampleTest() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Dexterity Vest", 19, quality);
	}
	
	
	@Test
	public void exampleTest1() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
        inn.setItem(new Item("Conjured Mana Cake", -1, 20));

		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Conjured Mana Cake", 18, quality);
		
	}
	
	@Test
	public void exampleTest2() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
        inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", -1, 20));

		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Backstage passes to a TAFKAL80ETC concert", 0, quality);
		
	}
	
	@Test
	public void exampleTest3() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
        inn.setItem(new Item("Aged Brie", -1, 20));

		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Aged Brie", 22, quality);
		
	}
	
	@Test
	public void exampleTest4() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
        inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 1, 20));

		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Sulfuras, Hand of Ragnaros", 20, quality);
		
	}
	
	@Test
	public void exampleTest5() {
		//create an inn, add an item, and simulate one day
				GildedRose inn = new GildedRose();
		        inn.setItem(new Item("Conjured Mana Cake", -1, 0));

				inn.oneDay();
				
				//access a list of items, get the quality of the one set
				List<Item> items = inn.getItems();
				int quality = items.get(0).getQuality();
				
				//assert quality has decreased by one
				assertEquals("Conjured Mana Cake", 0, quality);
		
	}
	
	@Test
	public void exampleTest6() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
        inn.setItem(new Item("Sulfuras, Hand of Ragnaros", -1, 20));

		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Sulfuras, Hand of Ragnaros", 20, quality);
		
	}
	
	@Test
	public void exampleTest7() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
        inn.setItem(new Item("Aged Brie", -1, 50));

		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Aged Brie", 50, quality);
		
	}
	
	@Test
	public void exampleTest8() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
        inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 9, 40));

		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Backstage passes to a TAFKAL80ETC concert", 42, quality);
		
	}
	
	
	@Test
	public void exampleTest9() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
        inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 8, 49));

		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Backstage passes to a TAFKAL80ETC concert", 50, quality);
		
	}
	
	@Test
	public void exampleTest10() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
        inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 13, 49));

		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Backstage passes to a TAFKAL80ETC concert",50, quality);
	}
	
	@Test
	public void exampleTest11() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
        inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 4, 49));

		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Backstage passes to a TAFKAL80ETC concert",50, quality);
	}
	

	
	@Test
	public void exampleTestArr() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		inn.setItem(new Item("Aged Brie", 2, 0));
		inn.setItem(new Item("Elixir of the Mongoose", 5, 7));
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		inn.setItem(new Item("Conjured Mana Cake", 3, 6));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		
		for(int i = 0; i < items.size(); i++) {
			int quality = items.get(i).getQuality();
			assertEquals(items.get(i).name, items.get(i).getQuality(), quality);
		}

		
	}
	
		
}




