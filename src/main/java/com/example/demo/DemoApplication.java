package com.example.demo;

import com.example.demo.movie.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Movie> welcome() {
		Movie movie1 = new Movie();
		movie1.setMovieID(1);
		movie1.setTitle("The Matrix");
		movie1.setDescription("A computer programmer discovers a dystopian world dominated by artificial intelligence.");
		movie1.setGenre("Action/Science Fiction");
		movie1.setReleaseDate(LocalDate.of(1999, 3, 31)); // Using Java 8's LocalDate
		movie1.setDuration(136); // 136 minutes
		movie1.setLanguage("English");

		Movie movie2 = new Movie();
		movie2.setMovieID(2);
		movie2.setTitle("Forrest Gump");
		movie2.setDescription("The life journey of a man with low intelligence, who inadvertently influences others.");
		movie2.setGenre("Drama/Comedy");
		movie2.setReleaseDate(LocalDate.of(1994, 7, 6));
		movie2.setDuration(142); // 142 minutes
		movie2.setLanguage("English");

		List<Movie> movies = new ArrayList<>();
		movies.add(movie1);
		movies.add(movie2);
		return movies;
	}
}
