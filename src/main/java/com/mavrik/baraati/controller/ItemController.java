package com.mavrik.baraati.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mavrik.baraati.model.Item;
import com.mavrik.baraati.model.ItemTypes;
import com.mavrik.baraati.model.SubCategories;
import com.mavrik.baraati.pojo.GetItemTypes;
import com.mavrik.baraati.repository.GetItemTypesRepository;
import com.mavrik.baraati.repository.ItemRepository;
import com.mavrik.baraati.repository.ItemTypesRepository;
import com.mavrik.baraati.repository.SubCategoriesRepository;

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
	
	@Autowired
	private ItemTypesRepository itemTypesRepository;
	@Autowired
	SubCategoriesRepository subCategoriesRepository;
	@Autowired
	GetItemTypesRepository getItemTypesRepository;
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
	/**
	 * 
	 * @param item
	 * @return
	 */
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
	
	
	@PostMapping("/getSubCategoryByCatId")
	public List<SubCategories> getSubCategoryByCatId(@RequestParam("catId") int catId) {
		
		return subCategoriesRepository.findByCategoryIdAndIsUsed(catId, 0);
 
	}
	
	
	
	@PostMapping("/addItemType")
	public ItemTypes addItemType(@RequestBody ItemTypes itemTypes) {
		
		ItemTypes itemTypesRes = itemTypesRepository.save(itemTypes);

		if (itemTypesRes == null) {
			itemTypesRes = new ItemTypes();
		}
		else {
			System.out.println("Item Add Successfully");
		}
		return itemTypesRes; 
	}
	
	@GetMapping("/getAllItemType")
	public List<GetItemTypes> getAllItemType() {
		
		return getItemTypesRepository.getItemType();
 
	}
	
	@GetMapping("/getAllItem")
	public List<Item> getAllItem() {
		
		return itemRepository.findByIsUsedOrderByItemNameAsc(0);
 
	}
	
}
