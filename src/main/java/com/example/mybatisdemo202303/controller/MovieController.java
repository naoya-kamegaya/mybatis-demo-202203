package com.example.mybatisdemo202303.controller;

import com.example.mybatisdemo202303.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

  private final MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @GetMapping("/movies")
  public List<String> movies(@RequestParam(required = false) Integer published_year) {
    if (published_year != null) {
      return movieService.findByPublishedYear(published_year).stream().map(MovieResponse::new).map(MovieResponse::getName).toList();
    } else {
      return movieService.findAll().stream().map(MovieResponse::new).map(MovieResponse::getName).toList();
    }
  }
}