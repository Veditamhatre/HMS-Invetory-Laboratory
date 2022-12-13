package com.hospital.management.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.hospital.management.model.Inventory;
import com.hospital.management.service.HmsService;


@Controller
public class HmsController {
	
	@Autowired
	private HmsService service;
	
	@GetMapping("/")
	public String home(Model m)
	{

	List<Inventory> inv = service.getAllInventory();	
	m.addAttribute("inv", inv);
		
		return "index";
	}

	@GetMapping("/addinventory")
	public String addInventoryForm()
	{
		return "Add_Inventory";
	}
	
	@PostMapping("/register")
	public String invRegister(@ModelAttribute Inventory i, HttpSession session)
	{
		System.out.println(i);
		
		service.addInventory(i);
		
		session.setAttribute("msg", " Inventory Added Successfully.....");
		
		return "redirect:/";
	}
	
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m)
	{
		Inventory i=service.getInventoryById(id);
		m.addAttribute("inv", i);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateInventory(@ModelAttribute Inventory i, HttpSession session)
	{
		System.out.println(i);
		service.addInventory(i);
		session.setAttribute("msg", "Inventory Data Updated Successfully...");		
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteInventory(@PathVariable int id, HttpSession session)
	{
	
		service.deleteInventory(id);
		session.setAttribute("msg", "Inventory Data Delete Successfully...");		
		return "redirect:/";
	}
	
	
}
	