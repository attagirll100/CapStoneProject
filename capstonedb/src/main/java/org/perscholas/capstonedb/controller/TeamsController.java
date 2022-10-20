package org.perscholas.capstonedb.controller;

import org.perscholas.capstonedb.model.Basketballplayers;
import org.perscholas.capstonedb.model.Teams;
import org.perscholas.capstonedb.service.BasketballplayersService;
import org.perscholas.capstonedb.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teams")
public class TeamsController {
    @Autowired
    TeamsService teamsService;


    @GetMapping
    public Iterable<Teams> getTeams() {
        return teamsService.getTeams();

    }
    @PostMapping
    public Teams createTeams(@RequestBody Teams teams) {
        return teamsService.createTeams(teams);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deletePlayers(@PathVariable Long id) {
        return teamsService.deleteTeams(id);
    }
    
}
