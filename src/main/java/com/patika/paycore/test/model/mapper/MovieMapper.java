package com.patika.paycore.test.model.mapper;

import com.patika.paycore.test.model.Movie;
import com.patika.paycore.test.model.dto.MovieDTO;

public class MovieMapper {

    public static MovieDTO toDto(Movie movie){
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.formatMovie(movie);  //?
        return movieDTO;
    }

/*
    MovieDTO toDto(Movie entity);

    Movie toEntity(MovieDTO dto);
*/


    public static Movie toDto(MovieDTO movieDTO){
        Movie movie = new Movie();
          //?????
        return movie;
    }
}
