package com.example.Service;

import com.example.Model.League;
import com.example.Model.Season;
import com.example.Repository.LeagueRepository;
import com.example.Repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by usu21 on 14/10/2015.
 */

@Service
@Transactional
public class SeasonService {

    @Autowired
    private SeasonRepository seasonRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    public void createSeasons(){

        League league1 = leagueRepository.findByNameLike("ACB");

        Season season1 = new Season();
        season1.setYear(2015);
        season1.setName("ACB 15-16");
        season1.setLeague(league1);
        seasonRepository.save(season1);

        Season season2 = new Season();
        season2.setYear(2016);
        season2.setName("ACB 16-17");
        season2.setLeague(league1);
        seasonRepository.save(season2);


    }
}
