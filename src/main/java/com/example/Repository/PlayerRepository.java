package com.example.Repository;

import com.example.Model.Player;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/*import java.util.Date;*/

/**
 * Created by usu21 on 05/10/2015.
 */
public interface PlayerRepository extends PagingAndSortingRepository<Player, Long> {
    /*public List<Player> findByNameContaining(String name);
    public List<Player> findByScoreGreaterThanEqual(int score);
    public List<Player> findByAsiBetween(int asi1, int asi2);
    public List<Player> findByPositionLike(String position);
    public List<Player> findByBirthdayLessThan(Date birthday);
    public List<Player> findByScoreGreaterThanAndBirthdayLessThan(int score, Date birthday);*/

    public List<Player> findByTeamName(String name);
    public List<Player> findByTeamNameAndPositionLike(String team, String position);
    public List<Player> findFirstByOrderByScoreDesc();
    public List<Player> findFirst5ByOrderByAsiDesc();

    @Query("SELECT p FROM Player p where p.team.name = :teamName order by p.score desc")
    List<Player> findPlayerOrderByScoreFromTeam(@Param("teamName") String teamName);
}