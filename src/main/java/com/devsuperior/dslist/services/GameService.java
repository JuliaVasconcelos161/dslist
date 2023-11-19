package com.devsuperior.dslist.services;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.dtos.GameDto;
import com.devsuperior.dslist.entities.dtos.GameMinDto;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameMinDto> findAllGames() {
        return gameRepository.findAll().stream().map(GameMinDto::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDto findGameById(Integer gameId) {
        Optional<Game> gameOptional = gameRepository.findById(gameId);
        return gameOptional.map(GameDto::new).orElse(null);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findGameByGameList(Integer gameListId) {
         return gameRepository.searchByList(gameListId).stream().map(GameMinDto::new).toList();
    }
}
