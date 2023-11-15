package com.devsuperior.dslist.entities.dtos;

import com.devsuperior.dslist.entities.GameList;

public class GameListDto {
    private Long gameListId;
    private String name;

    public GameListDto(){}

    public GameListDto(GameList entity) {
        this.gameListId = entity.getGameListId();
        this.name = entity.getName();
    }

    public Long getGameListId() {
        return gameListId;
    }

    public void setGameListId(Long gameListId) {
        this.gameListId = gameListId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
