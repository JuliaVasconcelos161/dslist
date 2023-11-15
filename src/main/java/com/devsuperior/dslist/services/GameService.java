package com.devsuperior.dslist.services;

import com.devsuperior.dslist.entities.dtos.GameMinDto;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameMinDto> findAllGames() {
        return gameRepository.findAll().stream().map(GameMinDto::new).toList();
    }
}
