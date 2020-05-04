package com.api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {
    private List<Movie> movies = Arrays.asList(
            new Movie("1","Avengers","adventure",2019),
            new Movie("2","Wonder Women","adventure",2018)
            );

    public List<Movie> getAllMovies(){
        return movies;
    }
}
