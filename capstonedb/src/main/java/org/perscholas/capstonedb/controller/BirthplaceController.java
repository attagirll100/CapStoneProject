package org.perscholas.capstonedb.controller;

import org.perscholas.capstonedb.model.Birthplace;
import org.perscholas.capstonedb.service.BirthplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/birthplace")
public class BirthplaceController {
    @Autowired
    BirthplaceService birthplaceService;

    @GetMapping
    public Iterable<Birthplace> getPlaces() {
        return birthplaceService.getPlaces();
    }
    @PostMapping
    public Birthplace createPlace(@RequestBody Birthplace birthplace) {
        return birthplaceService.createPlace(birthplace);
    }

    @DeleteMapping
    public HttpStatus deletePlace(@PathVariable Long id) {
        birthplaceService.deletePlace(id);
        return birthplaceService.deletePlace(id);
    }
}
