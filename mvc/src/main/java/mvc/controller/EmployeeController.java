package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	@RequestMapping("/")
	public String Employee() {
		System.out.println("This is home url");
		return "employee";
	}
	
	@RequestMapping(path="/details", method=RequestMethod.POST)
	public String form(@RequestParam("name") String userName,
			           @RequestParam("email") String userEmail,
			           @RequestParam("contact") String userContact,
			           Model model) 
	{
		System.out.println("This is detail url");
		model.addAttribute("name", userName);
		model.addAttribute("email",userEmail);
		model.addAttribute("contact", userContact);
		return "details";
	}
}