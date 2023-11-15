package com.devsuperior.dslist.entities.dtos;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDto {
    private Integer gameId;
    private String title;
    private Integer year;
    private String urlImg;
    private String shortDescription;

    public GameMinDto(){}

    public GameMinDto(Game entity) {
        this.gameId = entity.getGameId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.urlImg = entity.getUrlImg();
        this.shortDescription = entity.getShortDescription();
    }

    public GameMinDto(GameMinProjection projection) {
        this.gameId = projection.getGameId();
        this.title = projection.getTitle();
        this.year = projection.getYear();
        this.urlImg = projection.getUrlImg();
        this.shortDescription = projection.getShortDescription();
    }

    public Integer getGameId() {
        return gameId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
