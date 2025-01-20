package com.felixdev.dslist1.services;

import com.felixdev.dslist1.dto.GameMinDTO;
import com.felixdev.dslist1.entities.Game;
import com.felixdev.dslist1.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();

    }
}
