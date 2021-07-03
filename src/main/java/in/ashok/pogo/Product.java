package in.ashok.pogo;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Product {
	
	  private Integer productID;
	  private String productName;
	  private Double productCoast;
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductCoast() {
		return productCoast;
	}
	public void setProductCoast(Double productCoast) {
		this.productCoast = productCoast;
	}
	  
	  
	
	
}
