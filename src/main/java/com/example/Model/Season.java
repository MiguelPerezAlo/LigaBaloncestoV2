package com.example.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by usu21 on 14/10/2015.
 */

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int year;

    @Column
    private String name;

    @ManyToMany
    private Set<Team> teams = new HashSet<>();

    @ManyToOne
    private League league;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return "Season{" +
                "id=" + id +
                ", year=" + year +
                ", name='" + name + '\'' +
                ", league=" + league +
                '}';
    }
}