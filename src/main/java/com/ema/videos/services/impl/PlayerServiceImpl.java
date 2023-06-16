package com.ema.videos.services.impl;

import com.ema.videos.entities.PlayerEntity;
import com.ema.videos.models.Player;
import com.ema.videos.repositories.jpa.PlayerJpaRepository;
import com.ema.videos.services.PlayerServece;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerServece {
    @Autowired
    private PlayerJpaRepository playerJpaRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public Player getPlayerById(Long id) {
        PlayerEntity playerEntity = playerJpaRepository.getReferenceById(id);
        return modelMapper.map(playerEntity, Player.class);
    }

    @Override
    public Player savePlayer(Player player) {
        PlayerEntity playerEntity =  modelMapper.map(player, PlayerEntity.class);
        PlayerEntity playerEntitySaved = playerJpaRepository.save(playerEntity);
        return modelMapper.map(playerEntitySaved, Player.class);
    }
}
