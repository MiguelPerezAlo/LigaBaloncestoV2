package com.example.Service;

import com.example.Model.Player;
import com.example.Model.Team;
import com.example.Repository.PlayerRepository;
import com.example.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;


/**
 * Created by usu21 on 05/10/2015.
 */

@Service
@Transactional
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;

    Calendar cal=Calendar.getInstance();

    public void createPlayers(){

        Team team1 = teamRepository.findByNameLike("Unicaja");

        Player player = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();

        player.setName("Miguel");
        cal.set(1993, Calendar.APRIL, 24);
        player.setBirthday(cal.getTime());
        player.setAsi(25);
        player.setScore(110);
        player.setReb(40);
        player.setPosition("Ala-pivot");
        player.setTeam(team1);
        playerRepository.save(player);

        player2.setName("David");
        cal.set(1991, Calendar.FEBRUARY, 16);
        player2.setBirthday(cal.getTime());
        player2.setAsi(1);
        player2.setScore(20);
        player2.setReb(60);
        player2.setPosition("Pivot");
        player2.setTeam(team1);
        playerRepository.save(player2);

        player3.setName("Alex");
        cal.set(1995, Calendar.DECEMBER, 1);
        player3.setBirthday(cal.getTime());
        player3.setAsi(48);
        player3.setScore(50);
        player3.setReb(3);
        player3.setPosition("Base");
        player3.setTeam(team1);
        playerRepository.save(player3);

        player4.setName("Lluis");
        cal.set(1989, Calendar.JUNE, 30);
        player4.setBirthday(cal.getTime());
        player4.setAsi(30);
        player4.setScore(26);
        player4.setReb(10);
        player4.setPosition("Escolta");
        player4.setTeam(team1);
        playerRepository.save(player4);

        player5.setName("Cristian");
        cal.set(1985, Calendar.MARCH, 10);
        player5.setBirthday(cal.getTime());
        player5.setAsi(10);
        player5.setScore(150);
        player5.setReb(16);
        player5.setPosition("Alero");
        player5.setTeam(team1);
        playerRepository.save(player5);

        Team team2 = teamRepository.findByNameLike("Bruixa d'Or");

        Player player6 = new Player();
        Player player7 = new Player();
        Player player8 = new Player();
        Player player9 = new Player();
        Player player10 = new Player();

        player6.setName("Oscar");
        cal.set(1991, Calendar.JUNE, 15);
        player6.setBirthday(cal.getTime());
        player6.setAsi(30);
        player6.setScore(160);
        player6.setReb(15);
        player6.setPosition("Ala-pivot");
        player6.setTeam(team2);
        playerRepository.save(player6);

        player7.setName("Carlos");
        cal.set(1992, Calendar.SEPTEMBER, 20);
        player7.setBirthday(cal.getTime());
        player7.setAsi(20);
        player7.setScore(2);
        player7.setReb(350);
        player7.setPosition("Pivot");
        player7.setTeam(team2);
        playerRepository.save(player7);

        player8.setName("Aleix");
        cal.set(1993, Calendar.AUGUST, 12);
        player8.setBirthday(cal.getTime());
        player8.setAsi(100);
        player8.setScore(30);
        player8.setReb(20);
        player8.setPosition("Base");
        player8.setTeam(team2);
        playerRepository.save(player8);

        player9.setName("Patryk");
        cal.set(1990, Calendar.JULY, 26);
        player9.setBirthday(cal.getTime());
        player9.setAsi(50);
        player9.setScore(31);
        player9.setReb(2);
        player9.setPosition("Escolta");
        player9.setTeam(team2);
        playerRepository.save(player9);

        player10.setName("Matt");
        cal.set(1989, Calendar.JANUARY, 21);
        player10.setBirthday(cal.getTime());
        player10.setAsi(160);
        player10.setScore(500);
        player10.setReb(75);
        player10.setPosition("Alero");
        player10.setTeam(team2);
        playerRepository.save(player10);

        Team team3 = teamRepository.findByNameLike("F.C Barcelona");

        Player player11 = new Player();
        Player player12 = new Player();
        Player player13 = new Player();
        Player player14 = new Player();
        Player player15 = new Player();

        player11.setName("Derrick");
        cal.set(1993, Calendar.AUGUST, 15);
        player11.setBirthday(cal.getTime());
        player11.setAsi(20);
        player11.setScore(100);
        player11.setReb(26);
        player11.setPosition("Alero");
        player11.setTeam(team3);
        playerRepository.save(player11);

        player12.setName("Isaiah");
        cal.set(1989, Calendar.NOVEMBER, 10);
        player12.setBirthday(cal.getTime());
        player12.setAsi(120);
        player12.setScore(50);
        player12.setReb(2);
        player12.setPosition("Base");
        player12.setTeam(team3);
        playerRepository.save(player12);

        player13.setName("Dirk");
        cal.set(1987, Calendar.JUNE, 4);
        player13.setBirthday(cal.getTime());
        player13.setAsi(3);
        player13.setScore(40);
        player13.setReb(50);
        player13.setPosition("Pivot");
        player13.setTeam(team3);
        playerRepository.save(player13);

        player14.setName("Felipe");
        cal.set(1990, Calendar.APRIL, 26);
        player14.setBirthday(cal.getTime());
        player14.setAsi(10);
        player14.setScore(50);
        player14.setReb(20);
        player14.setPosition("Ala-pivot");
        player14.setTeam(team3);
        playerRepository.save(player14);

        player15.setName("Chacho");
        cal.set(1980, Calendar.DECEMBER, 31);
        player15.setBirthday(cal.getTime());
        player15.setAsi(53);
        player15.setScore(50);
        player15.setReb(10);
        player15.setPosition("Escolta");
        player15.setTeam(team3);
        playerRepository.save(player15);

        Team team4 = teamRepository.findByNameLike("Real Madrid");

        Player player16 = new Player();
        Player player17 = new Player();
        Player player18 = new Player();
        Player player19 = new Player();
        Player player20 = new Player();

        player16.setName("Ibaka");
        cal.set(1990, Calendar.JANUARY, 16);
        player16.setBirthday(cal.getTime());
        player16.setAsi(2);
        player16.setScore(60);
        player16.setReb(200);
        player16.setPosition("Pivot");
        player16.setTeam(team4);
        playerRepository.save(player16);

        player17.setName("Joe");
        cal.set(1985, Calendar.MAY, 16);
        player17.setBirthday(cal.getTime());
        player17.setAsi(10);
        player17.setScore(50);
        player17.setReb(25);
        player17.setPosition("Ala-pivot");
        player17.setTeam(team4);
        playerRepository.save(player17);

        player18.setName("Kevin");
        cal.set(1989, Calendar.AUGUST, 10);
        player18.setBirthday(cal.getTime());
        player18.setAsi(60);
        player18.setScore(50);
        player18.setReb(10);
        player18.setPosition("Escolta");
        player18.setTeam(team4);
        playerRepository.save(player18);

        player19.setName("Larry");
        cal.set(1990, Calendar.FEBRUARY, 17);
        player19.setBirthday(cal.getTime());
        player19.setAsi(10);
        player19.setScore(500);
        player19.setReb(20);
        player19.setPosition("Alero");
        player19.setTeam(team4);
        playerRepository.save(player19);

        player20.setName("Rajon");
        cal.set(1992, Calendar.APRIL, 17);
        player20.setBirthday(cal.getTime());
        player20.setAsi(170);
        player20.setScore(80);
        player20.setReb(0);
        player20.setPosition("Base");
        player20.setTeam(team4);
        playerRepository.save(player20);

        Team team5 = teamRepository.findByNameLike("BilbaoBasket");

        Player player21 = new Player();
        Player player22 = new Player();
        Player player23 = new Player();
        Player player24 = new Player();
        Player player25 = new Player();

        player21.setName("Michael");
        cal.set(1986, Calendar.NOVEMBER, 14);
        player21.setBirthday(cal.getTime());
        player21.setAsi(5);
        player21.setScore(310);
        player21.setReb(20);
        player21.setPosition("Alero");
        player21.setTeam(team5);
        playerRepository.save(player21);

        player22.setName("Julius");
        cal.set(1975, Calendar.JANUARY, 30);
        player22.setBirthday(cal.getTime());
        player22.setAsi(30);
        player22.setScore(110);
        player22.setReb(60);
        player22.setPosition("Ala-pivot");
        player22.setTeam(team5);
        playerRepository.save(player22);

        player23.setName("Ray");
        cal.set(1994, Calendar.JUNE, 24);
        player23.setBirthday(cal.getTime());
        player23.setAsi(24);
        player23.setScore(97);
        player23.setReb(31);
        player23.setPosition("Escolta");
        player23.setTeam(team5);
        playerRepository.save(player23);

        player24.setName("Kyrie");
        cal.set(1986, Calendar.FEBRUARY, 17);
        player24.setBirthday(cal.getTime());
        player24.setAsi(160);
        player24.setScore(198);
        player24.setReb(30);
        player24.setPosition("Base");
        player24.setTeam(team5);
        playerRepository.save(player24);

        player25.setName("Jake");
        cal.set(1969, Calendar.DECEMBER, 16);
        player25.setBirthday(cal.getTime());
        player25.setAsi(2);
        player25.setScore(167);
        player25.setReb(340);
        player25.setPosition("Pivot");
        player25.setTeam(team5);
        playerRepository.save(player25);

        /*System.out.println(playerRepository.findByNameContaining("Mi"));
        System.out.println(playerRepository.findByScoreGreaterThanEqual(50));
        System.out.println(playerRepository.findByAsiBetween(30, 50));
        System.out.println(playerRepository.findByPositionLike("Base"));
        cal.set(1990, Calendar.DECEMBER, 31);
        System.out.println(playerRepository.findByBirthdayLessThan(cal.getTime()));
        System.out.println(playerRepository.findByScoreGreaterThanAndBirthdayLessThan(100, cal.getTime()));*/

    }

    public void sameTeam(){
        System.out.println("Query 2:" + playerRepository.findByTeamName("Unicaja"));
    }

    public void sameTeamPosition(){
        System.out.println("Query 3: "+playerRepository.findByTeamNameAndPositionLike("Bruixa d'Or", "Alero"));
    }

    public void maxShooter(){
        System.out.println("Query 4: " + playerRepository.findFirstByOrderByScoreDesc());
    }

    public void topAssist(){
        System.out.println("Query 5: " + playerRepository.findFirst5ByOrderByAsiDesc());
    }

    public void topScorerTeam(){ System.out.println("Query 6: " + playerRepository.findPlayerOrderByScoreFromTeam("Unicaja").get(0));}
}