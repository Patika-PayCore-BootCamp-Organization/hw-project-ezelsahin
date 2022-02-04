package com.patika.paycore.test.controller;

import com.patika.paycore.test.model.Actor;
import com.patika.paycore.test.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping(path = "/get")
    public Actor getActor(@RequestParam Integer id){
        return actorService.getActor(id);
    }

    @GetMapping(path = "/all")
    public List<Actor> getAllActors(){

        return actorService.getAllActors();
    }

    @PostMapping(path = "/add")
    public boolean addActor(@RequestBody Actor actor){
        return actorService.addActor(actor);

    }

    @PutMapping(path = "/update" )
    public Actor updateActor(@RequestBody Actor actor){
        return actorService.updateActor(actor);

    }

    @DeleteMapping(path = "/delete/id={id}")
    public boolean deleteActor(@PathVariable Integer id)
    {
        return actorService.deleteActor(id);
    }
}
