package com.example.Repository;

import com.example.Model.Season;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by usu21 on 14/10/2015.
 */
public interface SeasonRepository extends PagingAndSortingRepository<Season, Long> {
    public Season findByYear (int year);
    public Season findByNameContaining (String name);
}
