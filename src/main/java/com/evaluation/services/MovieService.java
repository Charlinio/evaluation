package com.evaluation.services;

import com.evaluation.models.Movie;
import com.evaluation.repositories.CRUD;
import com.evaluation.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService extends CRUD<Movie, MovieRepository> {

    public MovieService(MovieRepository repository) {
        super(repository);
    }

    @Override
    public List<Movie> findAll() {
        return repository.findAll();
    }

    @Override
    public void add(Movie object) {
        repository.save(object);
    }

    @Override
    public void update(Movie object, int id) {
        object.setId(id);
        repository.save(object);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
