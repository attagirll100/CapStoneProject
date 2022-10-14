package org.perscholas.capstonedb.controller;

import org.perscholas.capstonedb.model.Basketballplayers;
import org.perscholas.capstonedb.service.BasketballplayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/basketballplayers")
public class BasketballplayersController {
    @Autowired
    BasketballplayersService basketballplayersService;


    @GetMapping
    public Iterable<Basketballplayers> getPlayers() {
        return basketballplayersService.getPlayers();

    }
    @PostMapping
    public Basketballplayers createPlayers(@RequestBody Basketballplayers basketballplayers) {
        return basketballplayersService.createPlayers(basketballplayers);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deletePlayers(@PathVariable Long id) {
        return basketballplayersService.deletePlayers(id);
    }

}
