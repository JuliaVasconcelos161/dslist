package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.entities.dtos.GameDto;
import com.devsuperior.dslist.entities.dtos.GameMinDto;
import com.devsuperior.dslist.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameMinDto> findAllGames() {
        return gameService.findAllGames();
    }

    @GetMapping("/{idGame}")
    public GameDto findGameById(@PathVariable Integer idGame) {
        return gameService.findGameById(idGame);
    }
}
