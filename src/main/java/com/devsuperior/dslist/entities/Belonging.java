package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPk idBelonging = new BelongingPk();

    private Integer position;

    public Belonging(Game game, GameList gameList, Integer position) {
        idBelonging.setGame(game);
        idBelonging.setGameList(gameList);
        this.position = position;
    }

    public BelongingPk getIdBelonging() {
        return idBelonging;
    }

    public void setIdBelonging(BelongingPk idBelonging) {
        this.idBelonging = idBelonging;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(idBelonging, belonging.idBelonging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBelonging);
    }
}
