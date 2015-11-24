package com.example.Service;

import com.example.Model.League;
import com.example.Model.Season;
import com.example.Repository.LeagueRepository;
import com.example.Repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by usu21 on 21/10/2015.
 */

@Service
@Transactional
public class LeagueService {

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private SeasonRepository seasonRepository;

    public void createLeague(){

        Season season1 = seasonRepository.findByNameContaining("ACB");

        League league1 = new League();
        league1.setName("ACB");
        league1.getSeasons().add(season1);
        leagueRepository.save(league1);
    }
}
