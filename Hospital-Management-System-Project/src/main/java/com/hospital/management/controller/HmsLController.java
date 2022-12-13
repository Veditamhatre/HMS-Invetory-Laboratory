//package com.hospital.management.controller;
//
//
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.hospital.management.model.LaboratoryTest;
//import com.hospital.management.service.HmsLService;
//
//
//
//@Controller
//public class HmsLController {
//
//
//@Autowired
//private HmsLService service;
//	
//    @GetMapping("/")
//	public String home(Model m)
//	{
//		List <LaboratoryTest> labtest=service.getalllabtest();
//		m.addAttribute("labtest", labtest );
//		return "index";
//	}
//
//	@GetMapping("/addtest")
//    public String addlabtestForm(){
//		
//		return "add_test";
//	}
//	
//	@PostMapping("/addlt")
//	public String labtestRegister(@ModelAttribute LaboratoryTest l, HttpSession session)
//	{
//		System.out.println(l);
//		
//		service.addlabtest(l);
//		session.setAttribute("msg", "Test Added Successfully...");
//		return "redirect:/";
//		
//	}
//	
//	@GetMapping("/edit/{id}")
//	public String editl(@PathVariable int id,Model m)
//	{
//		LaboratoryTest l=service.getlabtestById(id);
//		
//		m.addAttribute ("labtest",l);
//		return "edit";
//		
//	}
//	
//	@PostMapping("/update")
//	public String updateInventory(@ModelAttribute LaboratoryTest l, HttpSession session)
//	{
//		System.out.println(l);
//		service.addlabtest(l);
//		session.setAttribute("msg", "Test Data Updated Successfully...");		
//		return "redirect:/";
//	}
//	
//	
//	@GetMapping("/deletelt/{id}")
//	public String deleteInventory(@PathVariable int id, HttpSession session)
//	{
//	
//		service.deletelabtest(id);
//		session.setAttribute("msg", "Test Data Delete Successfully...");		
//		return "redirect:/";
//	}
//}