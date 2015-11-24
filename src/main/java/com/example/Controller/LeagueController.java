package com.example.Controller;

import com.example.Exception.LeagueException;
import com.example.Model.League;
import com.example.Repository.LeagueRepository;
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
@RequestMapping("/leagues")
public class LeagueController {


    @Autowired
    private LeagueRepository leagueRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public League save(@RequestBody League league) {
        return leagueRepository.save(league);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<League> findAll() {
        List<League> leagues = new ArrayList<League>();
        Iterator<League> iterator = leagueRepository.findAll().iterator();

        while (iterator.hasNext()) {
            leagues.add(iterator.next());
        }

        return leagues;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        League league = leagueRepository.findOne(id);

        if(league == null){throw new LeagueException(id);}

        leagueRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public League updateById(@PathVariable Long id, @RequestBody League league) {
        League l1 = leagueRepository.findOne(id);

        if(l1 == null){throw new LeagueException(id);}

        return leagueRepository.save(league);
    }
}
