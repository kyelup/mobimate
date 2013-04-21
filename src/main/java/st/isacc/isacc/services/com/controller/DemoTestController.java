package st.isacc.isacc.services.com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import st.isacc.isacc.services.com.entity.DemoUser;

@Controller
@RequestMapping({ "/test" })
public class DemoTestController {

	
	private List users;

	@RequestMapping(value = { "/test/{countryId}" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ModelAndView index(@PathVariable int countryId,HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView("index");
		users = new ArrayList();
		for(int i=0;i<10;i++){
			
			DemoUser d= new DemoUser();
			d.setUserName(i+"sss");
			d.setPassword(i+"sss");
			users.add(d);
		}
		System.out.println("------------------------");
		mav.addObject("users", users);
		return mav;
	}
}
