package com.dev.superior.dslist.services;

import com.dev.superior.dslist.entities.Game;
import com.dev.superior.dslist.entities.GameList;
import com.dev.superior.dslist.entities.dto.GameDTO;
import com.dev.superior.dslist.entities.dto.GameListDTO;
import com.dev.superior.dslist.entities.dto.GameMinDTO;
import com.dev.superior.dslist.repositories.GameListRepository;
import com.dev.superior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

}