package com.krishantha.eventManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krishantha.eventManager.model.Activity;

@Controller
public class ActivityController {

	@RequestMapping(value = "/greeting")
	public String getGreeting(Model model) {
		model.addAttribute("msg", "Wow spring you are awesome");
		return "welcome";
	}

	@RequestMapping(value = "/addActivity")
	public String addActivity(@ModelAttribute("activities") Activity activity) {
		System.out.println("Activity is " + activity.getActivityName());
		if (null != activity.getActivityName()) {
			return "redirect:addSubActivity.html";
		} else {
			return "addActivity";
		}
	}

	@RequestMapping(value = "/addSubActivity")
	public String addSubActivity(@ModelAttribute("activities") Activity activity) {
		System.out.println("Sub Activity is " + activity.getActivityName());
		return "addActivity";
	}

}
