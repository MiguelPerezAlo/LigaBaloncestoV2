package com.example.Repository;

import com.example.Model.League;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by usu21 on 21/10/2015.
 */
public interface LeagueRepository extends PagingAndSortingRepository<League, Long> {
    public League findByNameLike(String name);
}
