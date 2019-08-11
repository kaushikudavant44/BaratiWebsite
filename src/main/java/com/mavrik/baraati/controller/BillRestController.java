package com.mavrik.baraati.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mavrik.baraati.model.Item;
import com.mavrik.baraati.repository.ItemRepository;

@RestController
@RequestMapping("billRestController")
public class BillRestController {

	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/getItemBydesignCode")
	public Item getItem(@RequestParam("designCode") String designCode) {

		Item item = new Item();

		try {

			System.out.println(designCode);
			item = itemRepository.findByDesignNoAndIsUsed(designCode,1);
			
			if(item==null) {
				item = new Item();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return item;
	}

}
