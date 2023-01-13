package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;


@Controller
public class ContactController {
	
		
	@RequestMapping("/contact")
	public String showForm(Model m) {
	//	m.addAttribute("ty", "thank you...");
		return "contact";
		
	}
//	@RequestMapping(path="/processform",method = RequestMethod.POST)
//	public String handlrForm(
//			@RequestParam("userEmail")String userEmail,
//			@RequestParam("userName")String userName,
//			@RequestParam("UserPassword")String userPassword,Model model){
//		System.out.println(userEmail);
//		System.out.println(userName);
//		System.out.println(userPassword);
//		System.out.println("ayush");
//		model.addAttribute("email",userEmail);
//		model.addAttribute("Name", userName);
//		model.addAttribute("pass", userPassword);
//		return "success";
//		
//	}
//	    2nd method ---->>>>>
	
//	@RequestMapping(path="/processform",method = RequestMethod.POST)
//	public String handlrForm(
//			@RequestParam("userEmail")String userEmail,
//			@RequestParam("userName")String userName,
//			@RequestParam("UserPassword")String userPassword,Model model){
//		
//		User user=new User();
//		user.setUserEmail(userEmail);
//		user.setUserName(userName);
//		user.setUserPassword(userPassword);
//		
//		System.out.println(user);
//		
//		model.addAttribute("user", user);// pura object hi utha kr de diya direct
//				return "success";
//}
//                     use of =>@ModelAttribute Annotation
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handlrForm(@ModelAttribute User user , Model model){
	System.out.println(user);
	//model.addAttribute("ty", "thank you...");

		return "success";
	}
	@ModelAttribute
	public void commonDataForModel(Model mo) {
		mo.addAttribute("ty", "thank you...");
	}
	
	
	}

