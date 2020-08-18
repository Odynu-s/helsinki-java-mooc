package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {
	private Map<Film, List<Rating>> register;
	private Map<Person, Map<Film, Rating>> reviews;
	private List<Person> reviewers;
	
	public RatingRegister() {
		this.register = new HashMap<Film, List<Rating>>();
		this.reviews = new HashMap<Person, Map<Film, Rating>>();
		this.reviewers = new ArrayList<Person>();
	}
	
	public void addRating(Film film, Rating rating) {
		if (!register.containsKey(film)) {
			register.put(film, new ArrayList<Rating>());
		}
		register.get(film).add(rating);
		
	}
	
	public List<Rating> getRatings(Film film){
		return register.get(film);
	}
	
	public Map<Film, List<Rating>> filmRatings(){
		return register;
	}
	
	public void addRating(Person person, Film film, Rating rating) {
		if (!reviews.containsKey(person)) {
			reviews.put(person, new HashMap<Film, Rating>());
			reviews.get(person).put(film, rating);
			addRating(film, rating);
		}else if (!reviews.get(person).containsKey(film)) {
			reviews.get(person).put(film, rating);
			addRating(film, rating);
		}
	}
	
	public Rating getRatings(Person person, Film film) {
		if (!reviews.containsKey(person)) {
			return Rating.NOT_WATCHED;
		}else if (!reviews.get(person).containsKey(film)) {
			return Rating.NOT_WATCHED;
		}
		return reviews.get(person).get(film);
	}
	
	public Map<Film, Rating> getPersonalRatings(Person person) {
		return reviews.get(person);
	}
	
	public List<Person> reviewers(){
		return reviewers;
	}

}
