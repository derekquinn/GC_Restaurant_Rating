package com.restaurant.rating;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestaurantController {

	@Autowired
	private RestaurantDao restaurantDao;

	@RequestMapping("/")
	public ModelAndView showRestaurants() {

		List<Restaurant> restaurants = restaurantDao.findAll();
		ModelAndView mav = new ModelAndView("index", "restaurant", restaurants);
		return mav;
	}

	@RequestMapping("/upvote/{id}/")
	public ModelAndView sendUpvote(@PathVariable("id") Integer id) {

		Restaurant restaurant = restaurantDao.findById(id);
		restaurant.setRating(restaurant.getRating() + 1);
		System.out.println("food");
		return new ModelAndView("redirect:/");

	}

}
