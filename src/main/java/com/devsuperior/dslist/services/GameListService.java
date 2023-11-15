package com.devsuperior.dslist.services;

import com.devsuperior.dslist.entities.dtos.GameListDto;
import com.devsuperior.dslist.repositories.GameListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }


    @Transactional(readOnly = true)
    public List<GameListDto> findAllGameList() {
        return gameListRepository.findAll().stream().map(GameListDto::new).toList();
    }
}
