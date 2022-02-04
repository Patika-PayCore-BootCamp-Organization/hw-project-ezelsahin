package com.patika.paycore.test.service;

import com.patika.paycore.test.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();

    Movie getMovie(Integer id);

    boolean addMovie(Movie movie);

    Movie updateMovie(Movie movie);

    boolean deleteMovie(Integer id);

    String[] saveFavoriteMovies();

}
