package com.patika.paycore.test.model.dto;

import com.patika.paycore.test.model.Actor;
import com.patika.paycore.test.model.Movie;
import lombok.Data;

import java.util.List;
import java.util.StringJoiner;

@Data
public class MovieDTO {

    private String name;

    private List<Actor> actors;

    public String formatMovie(Movie movie){
        StringJoiner strJoiner = new StringJoiner(", ");
        this.actors.forEach(actor -> strJoiner.add(actor.toString()));
        return strJoiner.toString();
    }
}
