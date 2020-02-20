package com.evaluation.repositories;

import java.util.List;

public abstract class CRUD<T, E> {

    protected E repository;

    public CRUD(E repository) {
        this.repository = repository;
    }

    public abstract List<T> findAll();
    public abstract void add(T object);
    public abstract void update(T object, int id);
    public abstract void delete(int id);

}
