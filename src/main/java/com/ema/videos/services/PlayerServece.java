package com.ema.videos.services;

import com.ema.videos.models.Player;
import org.springframework.stereotype.Service;

@Service
public interface PlayerServece {
    Player getPlayerById(Long id);
    Player savePlayer(Player player);
}
