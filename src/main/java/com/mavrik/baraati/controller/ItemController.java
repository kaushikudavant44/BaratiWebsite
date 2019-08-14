package com.mavrik.baraati.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mavrik.baraati.common.Info;
import com.mavrik.baraati.model.BarcodeDetails;
import com.mavrik.baraati.model.Item;
import com.mavrik.baraati.model.ItemTypes;
import com.mavrik.baraati.model.SubCategories;
import com.mavrik.baraati.pojo.GetItemTypes;
import com.mavrik.baraati.pojo.ItemWithType;
import com.mavrik.baraati.repository.BarcodeDetailsRepository;
import com.mavrik.baraati.repository.GetItemTypesRepository;
import com.mavrik.baraati.repository.ItemRepository;
import com.mavrik.baraati.repository.ItemTypesRepository;
import com.mavrik.baraati.repository.ItemWithTypeRepository;
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
	
	@Autowired
	ItemWithTypeRepository itemWithTypeRepository;
	@Autowired
	BarcodeDetailsRepository barcodeDetailsRepository;
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
		
		
		System.out.println("In add item");
		Item item1 = itemRepository.save(item);

		if (item1 == null) {
			item1 = new Item();
		}
		else {
			
			BarcodeDetails barcodeDetails=new BarcodeDetails();
			int position = String.valueOf(item1.getBottomPrice()).indexOf(".");
			String barcode=item1.getVendorId()+String.valueOf(item1.getBottomPrice()).substring(0, position-1);
			if(barcode.length()<8)
			{
				  int count=8-barcode.length();
				  String no="";
				  for(int i=0;i<count;i++)
					  no=no+i;
				barcode=barcode+no;
			}
			barcodeDetails.setBarcode(barcode);
			barcodeDetails.setDesignNo(item1.getDesignNo());
			barcodeDetails.setItemId(item1.getItemId());
			barcodeDetails.setItemName(item1.getItemName());
			barcodeDetails.setTypeId(item1.getTypeId());
			barcodeDetails.setVendorId(item1.getVendorId());
			barcodeDetails.setItemPrice(item1.getItemPrice());
			barcodeDetails.setBottomPrice(item1.getBottomPrice());
			
			barcodeDetailsRepository.save(barcodeDetails);
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
	
	@GetMapping("/getAllItemWithItemType")
	public List<ItemWithType> getAllItemWithItemType() {
		
		return itemWithTypeRepository.findAllItemWithItemType();
 
	}
	
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	@PutMapping("/deleteItem")
	public Info deleteCategory(@RequestParam("itemId") int itemId) {
		Info info = new Info();

		System.out.println("itemId id" + itemId);

		int status = itemRepository.updateIsUsedByItemId(itemId);
		if (status == 1) {
			info.setError(false);
			info.setMessage("Deleted Successfully");
		} else {

			info.setError(true);
			info.setMessage("Vendor not deleted. Please try again.");
		}
		System.out.println(info.toString());
		
		return info;
		
	}
	
}
