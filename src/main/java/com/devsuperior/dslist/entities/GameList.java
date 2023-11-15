package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gameListId;
    private String name;

    public GameList() {}

    public GameList(Integer gameListId, String name) {
        this.gameListId = gameListId;
        this.name = name;
    }

    public Integer getGameListId() {
        return gameListId;
    }

    public void setGameListId(Integer gameListId) {
        this.gameListId = gameListId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(gameListId, gameList.gameListId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameListId);
    }
}
