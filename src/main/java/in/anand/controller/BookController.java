package in.anand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	
	@GetMapping("/bookdata")
	public String getBookData(Model model)
	{
		
		model.addAttribute("bookname", "Springboot");
		model.addAttribute("bookauthor", "Ashok");
		model.addAttribute("bookprice", "4200");
		
		return "book-data";
		
	}

}
