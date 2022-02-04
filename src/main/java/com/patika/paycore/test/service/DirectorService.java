package com.patika.paycore.test.service;

import com.patika.paycore.test.model.Director;

import java.util.List;

public interface DirectorService {

    List<Director> getAllDirectors();

    Director getDirector(Integer id);

    boolean addDirector(Director director);

    Director updateDirector(Director director);

    boolean deleteDirector(Integer id);

    String[] saveFavoriteDirectors();
}
