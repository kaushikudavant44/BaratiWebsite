package com.mavrik.baraati.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mavrik.baraati.repository.ItemRepository;

@Controller
public class BarcodeController {

	@Autowired
	ItemRepository itemRepository;
	
	@GetMapping("showBarcode/{itemId}")
	public String showAdvForm(Model model, @PathVariable("itemId")int itemId) {
		
		
		
		model.addAttribute("item",itemRepository.findByItemId(itemId));
		return "barcode";
	}
}
