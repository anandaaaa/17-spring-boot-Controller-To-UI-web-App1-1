package in.anand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import in.ashok.pogo.Plan;

@Controller
public class InsuranceplanController {
	
	@GetMapping("/plandetail")
	@ResponseBody
	public Plan getPlanDetails() {
		Plan plan = new Plan();
		plan.setPlanID(1111);
		plan.setPlanName("anand nivas");
		plan.setPlanStatus("accepted");return plan;
		
	}

}
