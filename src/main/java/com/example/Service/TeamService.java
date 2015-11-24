package com.example.Service;

import com.example.Model.Season;
import com.example.Model.Team;
import com.example.Repository.SeasonRepository;
import com.example.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;

/**
 * Created by usu21 on 13/10/2015.
 */
@Service
@Transactional
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private SeasonRepository seasonRepository;

    Calendar cal=Calendar.getInstance();

    public void createTeams(){
        Season season1 = seasonRepository.findByYear(2015);
        Season season2 = seasonRepository.findByYear(2016);

        Team team1 = new Team();
        team1.setName("Unicaja");
        cal.set(1977, Calendar.FEBRUARY, 8);
        team1.setCreation(cal.getTime());
        team1.setLocation("Malaga");
        teamRepository.save(team1);

        season1.getTeams().add(team1);
        seasonRepository.save(season1);

        Team team2 = new Team();
        team2.setName("Bruixa d'Or");
        cal.set(1980, Calendar.JUNE, 15);
        team2.setCreation(cal.getTime());
        team2.setLocation("Manresa");
        teamRepository.save(team2);

        season2.getTeams().add(team2);
        seasonRepository.save(season2);

        Team team3 = new Team();
        team3.setName("F.C Barcelona");
        cal.set(1969, Calendar.NOVEMBER, 5);
        team3.setCreation(cal.getTime());
        team3.setLocation("Barcelona");
        teamRepository.save(team3);

        season1.getTeams().add(team3);
        seasonRepository.save(season1);

        Team team4 = new Team();
        team4.setName("Real Madrid");
        cal.set(1971, Calendar.SEPTEMBER, 16);
        team4.setCreation(cal.getTime());
        team4.setLocation("Madrid");
        teamRepository.save(team4);

        season2.getTeams().add(team4);
        seasonRepository.save(season2);

        Team team5 = new Team();
        team5.setName("BilbaoBasket");
        cal.set(1990, Calendar.JUNE, 30);
        team5.setCreation(cal.getTime());
        team5.setLocation("Bilbao");
        teamRepository.save(team5);

        season1.getTeams().add(team4);
        seasonRepository.save(season1);


    }

    public void findCity(){
        System.out.println("Query 1: " + teamRepository.findByLocationLike("Malaga"));
    }
}
