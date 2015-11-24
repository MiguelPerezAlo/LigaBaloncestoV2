package com.example.Controller;

import com.example.Exception.TeamException;
import com.example.Model.Player;
import com.example.Model.Team;
import com.example.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by usu21 on 28/10/2015.
 */

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Team save(@RequestBody Team team) {
        return teamRepository.save(team);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Team> findAll() {
        List<Team> teams = new ArrayList<Team>();
        Iterator<Team> iterator = teamRepository.findAll().iterator();

        while (iterator.hasNext()) {
            teams.add(iterator.next());
        }

        return teams;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Team team = teamRepository.findOne(id);

        if(team == null){throw new TeamException(id);}

        teamRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Team updateById(@PathVariable Long id, @RequestBody Team team) {
        Team t1 = teamRepository.findOne(id);

        if(t1 == null){throw new TeamException(id);}

        return teamRepository.save(team);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Team getById(@PathVariable Long id) {
        Team team = teamRepository.findOne(id);

        if(team == null){throw new TeamException(id);}

        return team;
    }

    @RequestMapping(value = "/{idTeam}/players", method = RequestMethod.GET)
    public Set<Player> getPlayers(@PathVariable Long idTeam){
        Team team = teamRepository.findOne(idTeam);

        if(team == null){throw new TeamException (idTeam);}

        return team.getPlayers();
    }
}
