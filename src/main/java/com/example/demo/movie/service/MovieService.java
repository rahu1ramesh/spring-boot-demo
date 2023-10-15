package com.example.demo.movie.service;

import com.example.demo.movie.Movie;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class MovieService {
    public List<Movie> getMovies(){
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

        Movie movie3 = new Movie();
        movie3.setMovieID(3);
        movie3.setTitle("Inception");
        movie3.setDescription("A thief enters the dreams of others in this mind-bending heist thriller.");
        movie3.setGenre("Science Fiction/Thriller");
        movie3.setReleaseDate(LocalDate.of(2010, 7, 16));
        movie3.setDuration(148); // 148 minutes
        movie3.setLanguage("English");

        Movie movie4 = new Movie();
        movie4.setMovieID(4);
        movie4.setTitle("The Shawshank Redemption");
        movie4.setDescription("Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.");
        movie4.setGenre("Drama");
        movie4.setReleaseDate(LocalDate.of(1994, 9, 23));
        movie4.setDuration(142); // 142 minutes
        movie4.setLanguage("English");

        Movie movie5 = new Movie();
        movie5.setMovieID(5);
        movie5.setTitle("Avengers: Endgame");
        movie5.setDescription("The Avengers embark on a final mission to undo Thanos' destruction and save the universe.");
        movie5.setGenre("Action/Adventure");
        movie5.setReleaseDate(LocalDate.of(2019, 4, 26));
        movie5.setDuration(181); // 181 minutes
        movie5.setLanguage("English");

        Movie movie6 = new Movie();
        movie6.setMovieID(6);
        movie6.setTitle("Spirited Away");
        movie6.setDescription("A young girl enters the spirit world in this enchanting Japanese animated fantasy film.");
        movie6.setGenre("Animation/Fantasy");
        movie6.setReleaseDate(LocalDate.of(2001, 7, 20));
        movie6.setDuration(125); // 125 minutes
        movie6.setLanguage("Japanese (with English subtitles)");


        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add( movie6);
        movies.add(movie2);
        movies.sort(Comparator.comparing(Movie::getTitle));
        return movies;
    }
}
