package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by usu21 on 28/10/2015.
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class LeagueException extends RuntimeException{
    public LeagueException(Long id) {super ("DOESN'T EXIST ANY LEAGUE WITH THE ID: "+ id);}
}
