package com.example.mybatisdemo202303.controller;

import com.example.mybatisdemo202303.entity.Movie;

public class MovieResponse {
  private String name;

  public MovieResponse(Movie movie) {
    this.name = movie.getName();
  }

  public String getName() {
    return name;
  }
}
