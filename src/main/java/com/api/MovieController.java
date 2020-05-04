package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/movies")
    public List<Movie> getAllMovies () {
        return movieService.getAllMovies();
    }

    @RequestMapping("/movies/{id}")
    public Movie  getMovie(@PathVariable String id){
        return movieService.getMovie(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/movies")
    public void addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/movies/{id}")
    public Movie updateMovie(@RequestBody Movie movie,@PathVariable String id ){
        return movieService.updateMovie(id, movie);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/movies/{id}")
    public void deleteMovie(@PathVariable String id){
        movieService.deleteMovie(id);
    }
}
