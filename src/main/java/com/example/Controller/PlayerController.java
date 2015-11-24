package com.example.Controller;

import com.example.Exception.PlayerException;
import com.example.Model.Player;
import com.example.Model.Team;
import com.example.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by usu21 on 28/10/2015.
 */

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Player save(@RequestBody Player player) {
        return playerRepository.save(player);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Player> findAll() {
        List<Player> players = new ArrayList<Player>();
        Iterator<Player> iterator = playerRepository.findAll().iterator();

        while (iterator.hasNext()) {
            players.add(iterator.next());
        }

        return players;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Player player = playerRepository.findOne(id);

        if(player == null){throw new PlayerException(id);}

        playerRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Player getById(@PathVariable Long id) {
        Player player = playerRepository.findOne(id);

        if(player == null){throw new PlayerException(id);}

        return player;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Player updateById(@PathVariable Long id, @RequestBody Player player) {
        Player p1 = playerRepository.findOne(id);

        if(p1 == null){throw new PlayerException(id);}

        return playerRepository.save(player);
    }

    @RequestMapping(value = "/{idPlayer}/team", method = RequestMethod.GET)
    public Team getByTeam(@PathVariable Long idPlayer) {
        Player player = playerRepository.findOne(idPlayer);

        if (player == null) throw new PlayerException(idPlayer);

        return player.getTeam();

    }
}