package com.restaurant.rating;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestaurantController {
	
	@Autowired
	private RestaurantDao restaurantDao;

	@RequestMapping("/")
	public ModelAndView showCafeHome() {

		List<Restaurant> straunts = restaurantDao.findAll();
		ModelAndView mav = new ModelAndView("index", "straunts", straunts);
		return mav;
	}
	

}
