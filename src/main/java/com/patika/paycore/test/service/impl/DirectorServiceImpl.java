package com.patika.paycore.test.service.impl;

import com.patika.paycore.test.model.Director;
import com.patika.paycore.test.repository.DirectorRepository;
import com.patika.paycore.test.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorServiceImpl implements DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    @Override
    public List<Director> getAllDirectors()
    {
        List<Director> all = directorRepository.findAll();
        return all;
    }

    @Override
    public Director getDirector(Integer id)
    {
        Optional<Director> byId = directorRepository.findById(id);
        if(byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public boolean addDirector(Director director)
    {
        Director save = directorRepository.save(director);
        if(save == null)
            return false;
        return true;
    }


    @Override
    public Director updateDirector(Director director)
    {
        return directorRepository.save(director);
    }

    @Override
    public boolean deleteDirector(Integer id)
    {
        directorRepository.deleteById(id);
        return true;
    }

    @Override
    public String[] saveFavoriteDirectors(){
        String[] str = new String[3];

        return str;
    }
}
