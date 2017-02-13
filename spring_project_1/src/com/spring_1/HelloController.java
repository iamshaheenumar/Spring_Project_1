package com.spring_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="/",method = RequestMethod.GET)
	
	public String init(){
		return "index";
		
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String init(Model model,@ModelAttribute("regb") registration_bean regb){
		int rt=-1;
		registration_service reg=new registration_service();
		rt=reg.insertData(regb);
		if(rt==1){
			model.addAttribute("firstName",regb.getFirstName());
			model.addAttribute("lastName",regb.getLastName());
			model.addAttribute("email",regb.getEmail());
			model.addAttribute("password",regb.getPassword());
			return "success";
		}
		else{
			return "index";
		}

		
	}
	
}
