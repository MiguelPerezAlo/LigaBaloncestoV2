package com.example;

import com.example.Service.LeagueService;
import com.example.Service.PlayerService;
import com.example.Service.SeasonService;
import com.example.Service.TeamService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    private static PlayerService playerService;
    private static TeamService teamService;
    private static SeasonService seasonService;
    private static LeagueService leagueService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        leagueService = context.getBean(LeagueService.class);
        leagueService.createLeague();

        seasonService = context.getBean(SeasonService.class);
        seasonService.createSeasons();

        teamService = context.getBean(TeamService.class);
        teamService.createTeams();

        playerService = context.getBean(PlayerService.class);
        playerService.createPlayers();

        //Buscar equipos por ciudad
        teamService.findCity();

        //Buscar jugadores por nombre de equipo
        playerService.sameTeam();

        //Buscar jugadores por nombre de equipo y misma posición
        playerService.sameTeamPosition();

        //Buscar el maximo anotador
        playerService.maxShooter();

        //Buscar los 5 jugadores con mas asistencias
        playerService.topAssist();

        //Jugador con mas canastas de un equipo en concreto
        playerService.topScorerTeam();
    }
}
