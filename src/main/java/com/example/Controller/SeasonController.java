package com.example.Controller;

import com.example.Exception.SeasonException;
import com.example.Model.League;
import com.example.Model.Season;
import com.example.Repository.SeasonRepository;
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
@RequestMapping("/seasons")
public class SeasonController {

    @Autowired
    private SeasonRepository seasonRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Season save(@RequestBody Season season) {
        return seasonRepository.save(season);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Season> findAll() {
        List<Season> seasons = new ArrayList<Season>();
        Iterator<Season> iterator = seasonRepository.findAll().iterator();

        while (iterator.hasNext()) {
            seasons.add(iterator.next());
        }

        return seasons;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Season season = seasonRepository.findOne(id);

        if(season == null){throw new SeasonException(id);}

        seasonRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Season updateById(@PathVariable Long id, @RequestBody Season season) {
        Season s1 = seasonRepository.findOne(id);

        if(s1 == null){throw new SeasonException(id);}

        return seasonRepository.save(season);
    }

    @RequestMapping(value = "/{idSeason}/league/{idLeague}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Season addLeague(@PathVariable Long idSeason, @RequestBody Season season) {
        if (seasonRepository.findOne(idSeason) == null) throw new SeasonException(idSeason);
        return seasonRepository.save(season);
    }

    @RequestMapping(value = "/{idSeason}/league", method = RequestMethod.GET)
    public League getByLeague(@PathVariable Long idSeason) {
        Season season = seasonRepository.findOne(idSeason);

        if (season == null) throw new SeasonException(idSeason);

        return season.getLeague();

    }
}
