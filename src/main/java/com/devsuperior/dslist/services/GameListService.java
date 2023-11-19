package com.devsuperior.dslist.services;

import com.devsuperior.dslist.entities.dtos.GameListDto;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    private final GameRepository gameRepository;

    public GameListService(GameListRepository gameListRepository, GameRepository gameRepository) {
        this.gameListRepository = gameListRepository;
        this.gameRepository = gameRepository;
    }


    @Transactional(readOnly = true)
    public List<GameListDto> findAllGameList() {
        return gameListRepository.findAll().stream().map(GameListDto::new).toList();
    }

    @Transactional
    public void move(Integer gameListId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> gamesList =  gameRepository.searchByList(gameListId);
        GameMinProjection obj = gamesList.remove(sourceIndex);
        gamesList.add(destinationIndex, obj);
        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);
        for(int i = min; i <= max; i++)
            gameListRepository.updateBelongingPosition(gameListId, gamesList.get(i).getGameId(), i);

    }
}
