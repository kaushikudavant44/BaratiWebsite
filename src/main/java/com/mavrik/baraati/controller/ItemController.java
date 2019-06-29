/**
 * 
 */
package com.mavrik.baraati.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mavrik.baraati.model.Item;
import com.mavrik.baraati.repository.ItemRepository;

/**
 * 
 * @author Kaushik Udavant
 *
 */
@RestController
@RequestMapping("item")
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;
	
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	@GetMapping("getItemById/{id}")
	public Item getItem(@PathVariable("itemId") int itemId) {
		
		Item item = itemRepository.findById(itemId).get();

		if (item == null) {
			item = new Item();
		}
		return item;
	}
	@PostMapping("/addItem")
	public Item addItem(@RequestBody Item item) {
		
		Item item1 = itemRepository.save(item);

		if (item1 == null) {
			item1 = new Item();
		}
		else {
			System.out.println("Item Add Successfully");
		}
		return item1;
	}
	
}
