package com.mavrik.baraati.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mavrik.baraati.common.DateConvertor;
import com.mavrik.baraati.model.Item;
import com.mavrik.baraati.model.OrderDetail;
import com.mavrik.baraati.model.OrderHeader;
import com.mavrik.baraati.repository.BillDetailRepository;
import com.mavrik.baraati.repository.BillHeaderRepository;
import com.mavrik.baraati.repository.ItemRepository;

@Controller
public class BillController {

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private BillHeaderRepository billHeaderRepository;

	@Autowired
	private BillDetailRepository billDetailRepository;

	List<OrderDetail> orderDetailList = new ArrayList<>();

	@GetMapping("redimedBilling")
	public String showAddSubCategory(Model model) {

		// model.addAttribute("categoryList",categoryRepository.findByIsUsed(0));
		orderDetailList = new ArrayList<>();

		return "transaction/bill/bill";
	}

	@GetMapping("/getItemBydesignCode")
	public @ResponseBody Item getItem(HttpServletRequest request, HttpServletResponse response) {

		Item item = new Item();

		try {
			String designCode = request.getParameter("designCode");
			System.out.println(designCode);
			item = itemRepository.findByDesignNoAndIsUsed(designCode, 0);

			if (item == null) {
				item = new Item();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return item;
	}

	@GetMapping("/addItemInBillList")
	public @ResponseBody List<OrderDetail> addItemInBillList(HttpServletRequest request, HttpServletResponse response) {

		try {

			int itemId = Integer.parseInt(request.getParameter("itemId"));
			float itemQty = Float.parseFloat(request.getParameter("itemQty"));
			float amt = Float.parseFloat(request.getParameter("amt"));
			Item item = itemRepository.findByItemId(itemId);

			OrderDetail itemdetail = new OrderDetail();
			itemdetail.setItemId(itemId);
			itemdetail.setItemName(item.getItemName());
			itemdetail.setItemQty(itemQty);
			itemdetail.setMrp(amt);
			itemdetail.setTaxPer(item.getGstPer());
			itemdetail.setActualTaxableAmt((itemdetail.getMrp() * 100 / (100 + item.getGstPer())) * itemQty);
			itemdetail.setActualTaxAmt((itemdetail.getMrp() * item.getGstPer() / (100 + item.getGstPer())) * itemQty);
			itemdetail.setStatus(1);
			float taxableAmt = ((itemdetail.getMrp() - itemdetail.getDiscAmt()) * 100 / (100 + item.getGstPer())
					* itemQty);
			float taxAmt = ((itemdetail.getMrp() - itemdetail.getDiscAmt()) * item.getGstPer()
					/ (100 + item.getGstPer()) * itemQty);
			itemdetail.setTaxableAmt(taxableAmt);
			itemdetail.setTaxAmt(taxAmt);
			itemdetail.setGrandTotal(taxableAmt + taxAmt);
			orderDetailList.add(itemdetail);
			// System.out.println(orderDetailList);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return orderDetailList;
	}

	@PostMapping("/submitBill")
	public String submitBill(HttpServletRequest request, HttpServletResponse response) {

		try {

			Date date = new Date();
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat tt = new SimpleDateFormat("HH:mm:ss");
			OrderHeader order = new OrderHeader();
			order.setBillDate(sf.format(date));
			order.setBillNo(1);
			order.setStatus(1);
			float totalTaxable = 0;
			float totalTax = 0;
			float totalActualTaxable = 0;
			float totalActualTax = 0;

			for (int i = 0; i < orderDetailList.size(); i++) {

				totalTaxable = totalTaxable + orderDetailList.get(i).getTaxableAmt();
				totalTax = totalTax + orderDetailList.get(i).getTaxAmt();
				totalActualTaxable = totalActualTaxable + orderDetailList.get(i).getActualTaxableAmt();
				totalActualTax = totalActualTax + orderDetailList.get(i).getActualTaxAmt();
			}

			float discPer = Float.parseFloat(request.getParameter("discPer"));
			float discAmt = Float.parseFloat(request.getParameter("discAmt"));
			
			float totalHidden = Float.parseFloat(request.getParameter("totalHidden"));
			
			order.setCustName(request.getParameter("custName"));
			order.setCustMo(request.getParameter("custMo"));
			order.setEmail(request.getParameter("email"));
			order.setCustAdd("");
			order.setAdddateTime(sf.format(date));
			order.setAdddateTime(tt.format(date));
			order.setActualTotal(totalActualTaxable);
			order.setActualTaxrs(totalActualTax);
			order.setTaxableAmt(totalTaxable);
			order.setTaxRs(totalTax);
			order.setDiscRs(discAmt);
			order.setDiscPer(discPer);
			order.setGrandTotal(totalHidden);

			OrderHeader save = billHeaderRepository.save(order);

			for (int i = 0; i < orderDetailList.size(); i++) {

				orderDetailList.get(i).setBillId(save.getBillId());
			}

			List<OrderDetail> saveDetial = billDetailRepository.saveAll(orderDetailList);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/redimedBilling";
	}

	@GetMapping("/deleteItemFromBillDetail")
	public @ResponseBody List<OrderDetail> deleteItemFromBillDetail(HttpServletRequest request,
			HttpServletResponse response) {

		try {

			int key = Integer.parseInt(request.getParameter("key"));
			orderDetailList.remove(key);
			// System.out.println(orderDetailList);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return orderDetailList;
	}

	@GetMapping("stichinBilling")
	public String stichinBilling(Model model) {

		orderDetailList = new ArrayList<>();

		return "transaction/bill/stichingBill";
	}

	@GetMapping("/addItemInStitchingBillList")
	public @ResponseBody List<OrderDetail> addItemInStitchingBillList(HttpServletRequest request,
			HttpServletResponse response) {

		try {

			int itemId = Integer.parseInt(request.getParameter("itemId"));
			float itemQty = Float.parseFloat(request.getParameter("itemQty"));
			float amt = Float.parseFloat(request.getParameter("amt"));
			float stichingamt = Float.parseFloat(request.getParameter("stichingamt"));
			String itemDesc = request.getParameter("itemDesc");

			Item item = itemRepository.findByItemId(itemId);

			OrderDetail itemdetail = new OrderDetail();
			itemdetail.setItemId(itemId);
			itemdetail.setItemName(item.getItemName() + "-" + itemDesc);
			itemdetail.setItemQty(itemQty);
			itemdetail.setMrp(amt);
			itemdetail.setStitchingAmt(stichingamt);
			itemdetail.setRemark(itemDesc);

			if (stichingamt > 0) {
				itemdetail.setIsStiching(1);
				itemdetail.setStatus(0);
			} else {
				itemdetail.setStatus(1);
			}
			itemdetail.setTaxPer(item.getGstPer());
			itemdetail.setActualTaxableAmt((amt + stichingamt) * itemQty);
			itemdetail.setActualTaxAmt((item.getGstPer() / 100) * itemdetail.getActualTaxableAmt());

			float taxableAmt = itemdetail.getActualTaxableAmt();
			float taxAmt = itemdetail.getActualTaxAmt();

			itemdetail.setTaxableAmt(taxableAmt);
			itemdetail.setTaxAmt(taxAmt);
			itemdetail.setGrandTotal(taxableAmt + taxAmt);
			orderDetailList.add(itemdetail);
			System.out.println(orderDetailList);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return orderDetailList;
	}

	@GetMapping("/deleteItemFromStitchingBillDetail")
	public @ResponseBody List<OrderDetail> deleteItemFromStitchingBillDetail(HttpServletRequest request,
			HttpServletResponse response) {

		try {

			int key = Integer.parseInt(request.getParameter("key"));
			orderDetailList.remove(key);
			// System.out.println(orderDetailList);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return orderDetailList;
	}

	@PostMapping("/submitStitchingBill")
	public String submitStitchingBill(HttpServletRequest request, HttpServletResponse response) {

		try {

			Date date = new Date();
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat tt = new SimpleDateFormat("HH:mm:ss");
			OrderHeader order = new OrderHeader();
			order.setBillDate(sf.format(date));
			order.setBillNo(1);

			float totalTaxable = 0;
			float totalTax = 0;
			float totalActualTaxable = 0;
			float totalActualTax = 0;

			int sts = 1;

			for (int i = 0; i < orderDetailList.size(); i++) {

				totalTaxable = totalTaxable + orderDetailList.get(i).getTaxableAmt();
				totalTax = totalTax + orderDetailList.get(i).getTaxAmt();
				totalActualTaxable = totalActualTaxable + orderDetailList.get(i).getActualTaxableAmt();
				totalActualTax = totalActualTax + orderDetailList.get(i).getActualTaxAmt();

				if (orderDetailList.get(i).getStatus() == 0) {
					sts = 0;
				}
			}

			order.setCustName(request.getParameter("custName"));
			order.setCustMo(request.getParameter("custMo"));
			order.setEmail(request.getParameter("email"));
			order.setCustAdd("");
			order.setAdddateTime(sf.format(date));
			order.setAdddateTime(tt.format(date));
			order.setActualTotal(totalActualTaxable);
			order.setActualTaxrs(totalActualTax);
			order.setTaxableAmt(totalTaxable);
			order.setTaxRs(totalTax);
			order.setGrandTotal(totalTaxable + totalTax);
			order.setStatus(sts);
			order.setIsStiching(1);

			OrderHeader save = billHeaderRepository.save(order);

			for (int i = 0; i < orderDetailList.size(); i++) {

				orderDetailList.get(i).setBillId(save.getBillId());
			}

			List<OrderDetail> saveDetial = billDetailRepository.saveAll(orderDetailList);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/stichinBilling";
	}

	@GetMapping("showBillList")
	public String showBillList(HttpServletRequest request, HttpServletResponse response, Model model) {

		try {

			String frDate = request.getParameter("frDate");
			String toDate = request.getParameter("toDate");

			if ((frDate != "" || frDate != null) && (toDate != "" || toDate != null)) {

				List<OrderHeader> list = billHeaderRepository.findBetweenDate(DateConvertor.convertToYMD(frDate),
						DateConvertor.convertToYMD(toDate));
				for (int i = 0; i < list.size(); i++) {
					list.get(i).setBillDate(DateConvertor.convertToDMY(list.get(i).getBillDate()));
				}
				model.addAttribute("frDate", frDate);
				model.addAttribute("toDate", toDate);
				model.addAttribute("list", list);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "transaction/bill/showBillList";
	}

	@GetMapping("/deleteBill")
	public String deleteBill(HttpServletRequest request, HttpServletResponse response) {

		try {

			int billId = Integer.parseInt(request.getParameter("billId"));
			int delete = billHeaderRepository.deleteBill(billId);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/showBillList";
	}

	@GetMapping("updateBillStatus")
	public String updateBillStatus(HttpServletRequest request, HttpServletResponse response, Model model) {

		try {
			int billId = Integer.parseInt(request.getParameter("billId"));
			OrderHeader orderHeader = billHeaderRepository.findByBillId(billId);
			// orderHeader.setBillDate(DateConvertor.convertToDMY(orderHeader.getBillDate()));
			List<OrderDetail> orderDetail = billDetailRepository.findByBillId(billId);
			
			model.addAttribute("orderHeader", orderHeader);
			model.addAttribute("orderDetail",orderDetail);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "transaction/bill/updateBillStatus";
	}
	
	@GetMapping("/completeBillDetail")
	public String completeBillDetail(HttpServletRequest request, HttpServletResponse response) {

		int billId = Integer.parseInt(request.getParameter("billId"));
		int billDetailId = Integer.parseInt(request.getParameter("billDetailId"));
		try {

			
			int update = billDetailRepository.updateDetail(billDetailId);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/updateBillStatus?billId="+billId;
	}
	
	@PostMapping("/completeBillHeader")
	public String completeBillHeader(HttpServletRequest request, HttpServletResponse response) {

		try {

			int billId = Integer.parseInt(request.getParameter("billId"));

			int updateHeder = billHeaderRepository.updateDetail(billId); 
			int updateDetail = billDetailRepository.updateDetailAll(billId);
			 

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/showBillList";
	}
}
