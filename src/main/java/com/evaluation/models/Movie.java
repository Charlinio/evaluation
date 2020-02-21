package com.evaluation.models;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @Column(name = "id", columnDefinition = "int(5) unsigned")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", length = 40)
    private String title;

    @Column(name = "synopsis", length = 300)
    private String synopsis;

    @Column(name = "genre", columnDefinition = "char(20)")
    private String genre;

    @Column(name = "picture", columnDefinition = "char(20)")
    private String picture;

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
