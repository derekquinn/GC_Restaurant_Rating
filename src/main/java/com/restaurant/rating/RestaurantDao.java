package com.restaurant.rating;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class RestaurantDao {

	@PersistenceContext
	private EntityManager em;

	public List<Restaurant> findAll() {
		// BeanPropertyRowMapper uses the rows from the SQL result create
		// new Room objects and fill in the values by calling the setters.
		// Use .query for SQL SELECT statements.
		return em.createQuery("FROM Restaurant", Restaurant.class).getResultList();
	}

	public Restaurant findById(Integer id) {
		return em.find(Restaurant.class, id);
	}

	public void update(Restaurant aRestaurant) {
		em.merge(aRestaurant);
	}
	
	public void upvoteRestaurant(Long id, Integer rating) {
		em.createQuery("FROM Restaurant WHERE id = :id UPDATE rating = :rating").setParameter("id", id).setParameter("rating", rating);
	}

}
