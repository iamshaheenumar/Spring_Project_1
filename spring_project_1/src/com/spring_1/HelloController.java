package com.spring_1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	private String saveDirectory="/home/shaheen/files-from-spring-project/";
	@RequestMapping(value="/",method = RequestMethod.GET)
	
	public String init(){
		return "index";
		
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveForm(Model model,@ModelAttribute("regb") registration_bean regb,@RequestParam CommonsMultipartFile file,HttpSession session){
		boolean rt=false;
		
		
		
		String filename=file.getOriginalFilename();
		
		
		
		//File Operations
		
	
	      
	          
	    System.out.println(saveDirectory+" "+filename);  
	    try{  
	        byte barr[]=file.getBytes();  
	          
	        BufferedOutputStream bout=new BufferedOutputStream(  
	                 new FileOutputStream(saveDirectory+"/"+filename));  
	        bout.write(barr);  
	        bout.flush();  
	        bout.close();  
	          
	        }catch(Exception e){System.out.println(e);}
	    	
	    	registration_service reg=new registration_service();
	    	regb.setFileName(filename);
	    	rt=reg.insertData(regb);
		
	   
		if(rt==false){
			System.out.println("It works !");
			model.addAttribute("firstName",regb.getFirstName());
			model.addAttribute("lastName",regb.getLastName());
			model.addAttribute("email",regb.getEmail());
			model.addAttribute("password",regb.getPassword());
			return new ModelAndView("success");
		}
		else{
			return new ModelAndView("index");
		}

		
	}
	
	
	@RequestMapping("/success")
	public ModelAndView showSuccess(){
		return new ModelAndView("success");
	}
	
	
}
