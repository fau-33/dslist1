package com.felixdev.dslist1.repositories;

import com.felixdev.dslist1.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
