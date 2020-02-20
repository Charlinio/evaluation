package com.evaluation.restcontrollers;

import com.evaluation.models.Movie;
import com.evaluation.services.MovieService;
import com.evaluation.utils.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = UrlConstants.MOVIE)
public class MovieRestController {

    @Autowired
    private MovieService movieService;

    @GetMapping(path = UrlConstants.ALL)
    public List<Movie> getMovies(){
        return movieService.findAll();
    }

    @PostMapping(path = UrlConstants.ADD)
    public void save(@RequestBody Movie object) {
        movieService.add(object);
    }

    @PutMapping(path = UrlConstants.UPDATE)
    public void update(@RequestBody Movie object, @PathVariable Integer id) {
        movieService.update(object, id);
    }

    @DeleteMapping(path = UrlConstants.DELETE)
    public void delete(@PathVariable Integer id) {
        movieService.delete(id);
    }


}
