package org.perscholas.capstonedb.controller;

import org.perscholas.capstonedb.model.Stadium;
import org.perscholas.capstonedb.service.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stadium")
public class StadiumController {

    @Autowired
    StadiumService stadiumService;

    @GetMapping
    public Iterable<Stadium> getArenas() {
        return stadiumService.getArenas();
    }
    @PostMapping
    public Stadium createArena(@RequestBody Stadium stadium) {
        return stadiumService.createArena(stadium);

    }
    @DeleteMapping("/{id}")
    public HttpStatus deleteArena(@PathVariable Long id) {
        stadiumService.deleteArena(id);
        return stadiumService.deleteArena(id);
    }
}
