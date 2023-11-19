package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.entities.dtos.GameListDto;
import com.devsuperior.dslist.entities.dtos.GameMinDto;
import com.devsuperior.dslist.entities.dtos.ReplacementDto;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    private final GameListService gameListService;

    private final GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameListDto> findAllGameList() {
        return gameListService.findAllGameList();
    }

    @GetMapping("/{gameListId}/games")
    public List<GameMinDto> findGameByGameList(@PathVariable Integer gameListId) {
        return gameService.findGameByGameList(gameListId);
    }

    @PostMapping("/{gameListId}/replacement")
    public void move(@PathVariable Integer gameListId,
                     @RequestBody ReplacementDto replacementDto) {
        gameListService.move(gameListId, replacementDto.getSourceIndex(), replacementDto.getDestinationIndex());
    }
}
