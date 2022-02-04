package com.patika.paycore.test.controller;

import com.patika.paycore.test.model.Movie;
import com.patika.paycore.test.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping (path = "/get")
    public Movie getMovie(@RequestParam Integer id){
        return movieService.getMovie(id);
    }

    @GetMapping(path = "/all")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @PostMapping(path = "/add")
    public boolean addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);

    }

    @PutMapping (path = "/update" )
    public Movie updateMovie(@RequestBody Movie movie){
        return movieService.updateMovie(movie);

    }

    @DeleteMapping(path = "/delete/id={id}")
    public boolean deleteMovie(@PathVariable Integer id){
        return movieService.deleteMovie(id);

    }
}
