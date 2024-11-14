package com.dev.superior.dslist.repositories;

import com.dev.superior.dslist.entities.Game;
import com.dev.superior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
