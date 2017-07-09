package com.chathu.petHealthcareManagement.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.chathu.petHealthcareManagement.model.Owner;
import com.chathu.petHealthcareManagement.service.OwnerService;


@Controller
@SessionAttributes("owner")
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;
	
	@RequestMapping(value = "/addOwner",method=RequestMethod.GET)
	public String getEvent(Model model,HttpSession httpSession){

		Owner owner=(Owner) httpSession.getAttribute("owner");
		if(owner==null){
			owner= new Owner();
		}
		model.addAttribute("owner", owner);
		return "addOwner";

	}
	
	@RequestMapping(value = "/addOwner", method = RequestMethod.POST)
	public String updateEvent(Owner owner) {
			
			ownerService.save(owner);
			System.out.println("Default event updated as : " + owner.getOwnerName());
			return "redirect:addOwner.html";
		
	}
	
}
