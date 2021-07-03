package in.anand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashok.pogo.Product;

@Controller
public class ProductController {

		@GetMapping("/productdata")
	  public ModelAndView getproductDetails() {
			
			ModelAndView modelAndView = new ModelAndView();
	  
	  Product product = new Product();
	  product.setProductID(1);
	  product.setProductName("sofa");
	  product.setProductCoast(4500.00);
	  modelAndView.addObject("product",product);
	  modelAndView.setViewName("product-data");
	  
	  return modelAndView;
	  
	  }
	  
	 
}
