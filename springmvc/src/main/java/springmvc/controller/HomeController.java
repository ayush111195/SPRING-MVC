package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
public String home(Model model) 
{
		System.out.println("this is home ");
model.addAttribute("name","ayushgupta");
model.addAttribute("id",11111);
List<String>friends=new ArrayList<String>();
friends.add("Ayush");
friends.add("Arpit");
friends.add("Shweta");
friends.add("mummy ,papa");
model.addAttribute("f",friends);


	return "index";                       
}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about");
		return"about";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help controller");
		
		// creating model and view controller--->>>
		ModelAndView mda= new ModelAndView();
		
		//setting the data--->>
		mda.addObject("name", "arpit");
		mda.addObject("id",12345);
		LocalDateTime now=LocalDateTime.now();
		mda.addObject("time", now);
		
		// setting the view name---->>
		mda.setViewName("help");
		
		return mda;
		
	}
	@RequestMapping("/info")
	public ModelAndView info()
	{
		System.out.println("this is info page");
		// creating model and view controller--->>>
		ModelAndView mav=new ModelAndView();
		//setting the data--->>
		mav.addObject("contact",6392709);
		mav.addObject("name","jay");
		List<String>Employees=new ArrayList<String>();
		Employees.add("rakesh");
		Employees.add("mohan");
		Employees.add("sohan");
		Employees.add("roshan");
		mav.addObject("emp", Employees);
		// setting the view name---->>
		mav.setViewName("info");
		
		return mav;
		
	}
}
