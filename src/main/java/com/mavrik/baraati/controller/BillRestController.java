package com.mavrik.baraati.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mavrik.baraati.model.Item;
import com.mavrik.baraati.model.OrderDetail;
import com.mavrik.baraati.repository.ItemRepository;

@RestController
@RequestMapping("billRestController")
public class BillRestController {

	@Autowired
	private ItemRepository itemRepository;
	
	List<OrderDetail> orderDetailList = new ArrayList<>();
	
	
	/*@PostMapping("/getItemBydesignCode")
	public Item getItem(@RequestParam("designCode") String designCode) {

		Item item = new Item();

		try {

			System.out.println(designCode);
			item = itemRepository.findByDesignNoAndIsUsed(designCode,0);
			
			if(item==null) {
				item = new Item();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return item;
	}
	
	@PostMapping("/addItemInBillList")
	public  List<OrderDetail> getItem(@RequestParam("itemId") int itemId,@RequestParam("itemQty") float itemQty) {

		 
		try {
 
			Item item = itemRepository.findByItemId(itemId);
			
			OrderDetail itemdetail = new OrderDetail();
			itemdetail.setItemId(itemId);
			itemdetail.setItemName(item.getItemName());
			itemdetail.setItemQty(itemQty);
			itemdetail.setMrp(item.getBottomPrice()); 
			itemdetail.setTaxPer(item.getGstPer());
			itemdetail.setActualTaxableAmt(itemdetail.getMrp()*100/(100+item.getGstPer()));
			itemdetail.setActualTaxAmt(itemdetail.getMrp()*item.getGstPer()/(100+item.getGstPer()));
			
			float taxableAmt = (itemdetail.getMrp()-itemdetail.getDiscAmt())*100/(100+item.getGstPer()); 
			float taxAmt = (itemdetail.getMrp()-itemdetail.getDiscAmt())*item.getGstPer()/(100+item.getGstPer()); 
			itemdetail.setTaxableAmt(taxableAmt);
			itemdetail.setTaxAmt(taxAmt); 
			itemdetail.setGrandTotal(taxableAmt+taxAmt); 
			orderDetailList.add(itemdetail); 
			System.out.println(orderDetailList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return orderDetailList;
	}*/

}
