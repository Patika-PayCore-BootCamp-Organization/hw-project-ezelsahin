package com.patika.paycore.test.service.impl;

import com.patika.paycore.test.model.Movie;
import com.patika.paycore.test.repository.MovieRepository;
import com.patika.paycore.test.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies()
    {
        List<Movie> all = movieRepository.findAll();
        return all;
    }

    @Override
    public Movie getMovie(Integer id)
    {
        Optional<Movie> byId = movieRepository.findById(id);
        if(byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public boolean addMovie(Movie movie)
    {
        Movie save = movieRepository.save(movie);
        if(save == null)
            return false;
        return true;
    }

    @Override
    public Movie updateMovie(Movie movie)
    {
        return movieRepository.save(movie);
    }

    @Override
    public boolean deleteMovie(Integer id)
    {
        movieRepository.deleteById(id);
        return true;
    }

    @Override
    public String[] saveFavoriteMovies(){
        String[] str = new String[5];

        return str;
    }

}
