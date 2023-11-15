package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface GameRepository extends JpaRepository<Game, Integer> {
    @Query(nativeQuery = true, value = """
		SELECT tb_game.game_id as gameId, tb_game.title, tb_game.game_year AS `year`, tb_game.url_img AS urlImg,
		tb_game.short_description AS shortDescription
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.game_id = tb_belonging.game_id
		WHERE tb_belonging.game_list_id = :gameListId
		ORDER BY tb_belonging.position
			""")
    List<GameMinProjection> searchByList(Integer gameListId);
}
