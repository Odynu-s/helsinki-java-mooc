package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film> {
	private Map<Film, List<Rating>> ratings;
	
	public FilmComparator(Map<Film, List<Rating>> ratings) {
		this.ratings = ratings;
	}
	
	public int compare(Film o1, Film o2) {
		return average(o2) - average(o1);
	}
	
	private int average(Film film) {
		int counter = 0;
		int num = 0;
		for (Rating rating: ratings.get(film)) {
			num += rating.getValue();
			counter++;
		}
		return num / counter;
	}

}
