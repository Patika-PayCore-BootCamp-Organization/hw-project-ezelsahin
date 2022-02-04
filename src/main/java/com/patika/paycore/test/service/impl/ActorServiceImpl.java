package com.patika.paycore.test.service.impl;

import com.patika.paycore.test.model.Actor;
import com.patika.paycore.test.repository.ActorRepository;
import com.patika.paycore.test.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public List<Actor> getAllActors()
    {
        List<Actor> all = actorRepository.findAll();
        return all;
    }

    @Override
    public Actor getActor(Integer id)
    {
        Optional<Actor> byId = actorRepository.findById(id);
        if(byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public boolean addActor(Actor actor)
    {
        Actor save = actorRepository.save(actor);
        if(save == null)
            return false;
        return true;
    }


    @Override
    public Actor updateActor(Actor actor)
    {
        return actorRepository.save(actor);
    }

    @Override
    public boolean deleteActor(Integer id)
    {
        actorRepository.deleteById(id);
        return true;
    }

    @Override
    public String[] saveFavoriteActors(){
        String[] str = new String[5];

        return str;
    }
}
