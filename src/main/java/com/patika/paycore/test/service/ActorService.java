package com.patika.paycore.test.service;

import com.patika.paycore.test.model.Actor;

import java.util.List;

public interface ActorService {

    List<Actor> getAllActors();

    Actor getActor(Integer id);

    boolean addActor(Actor actor);

    Actor updateActor(Actor actor);

    boolean deleteActor(Integer id);

    String[] saveFavoriteActors();

}
