package com.example.Repository;

import com.example.Model.Team;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by usu21 on 13/10/2015.
 */
public interface TeamRepository extends PagingAndSortingRepository<Team, Long> {
    public Team findByNameLike (String name);
    public List<Team> findByLocationLike(String name);
}
