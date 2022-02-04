package com.patika.paycore.test.controller;

import com.patika.paycore.test.model.Director;
import com.patika.paycore.test.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/director")
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping(path = "/get")
    public Director getDirector(@RequestParam Integer id){
        return directorService.getDirector(id);
    }

    @GetMapping(path = "/all")
    public List<Director> getAllDirectors(){

        return directorService.getAllDirectors();
    }

    @PostMapping(path = "/add")
    public boolean addDirector(@RequestBody Director director){
        return directorService.addDirector(director);

    }

    @PutMapping(path = "/update" )
    public Director updateDirector(@RequestBody Director director){
        return directorService.updateDirector(director);

    }

    @DeleteMapping(path = "/delete/id={id}")
    public boolean deleteDirector(@PathVariable Integer id)
    {
        return directorService.deleteDirector(id);
    }
}
