package com.dev.superior.dslist.controllers;

import com.dev.superior.dslist.entities.dto.GameDTO;
import com.dev.superior.dslist.entities.dto.GameListDTO;
import com.dev.superior.dslist.entities.dto.GameMinDTO;
import com.dev.superior.dslist.services.GameListService;
import com.dev.superior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
