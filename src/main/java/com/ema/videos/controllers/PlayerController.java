package com.ema.videos.controllers;

import com.ema.videos.models.Player;
import com.ema.videos.services.PlayerServece;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    PlayerServece playerServece;
    @GetMapping("/get/{id}")
    public ResponseEntity<Player> getPlayerByIg(@PathVariable Long id){
        return ResponseEntity.ok(playerServece.getPlayerById(id));
    }
    @PostMapping("/save")
    public ResponseEntity<Player> savePlayer(@RequestBody @Valid Player player){
        return ResponseEntity.ok(playerServece.savePlayer(player));
    }
}
