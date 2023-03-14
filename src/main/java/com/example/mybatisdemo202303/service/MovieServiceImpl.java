package com.example.mybatisdemo202303.service;

import com.example.mybatisdemo202303.entity.Movie;
import com.example.mybatisdemo202303.mapper.MovieMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

  private final MovieMapper movieMapper;

  public MovieServiceImpl(MovieMapper movieMapper) {
    this.movieMapper = movieMapper;
  }

  public List<Movie> findAll() {
    return movieMapper.findAll();
  }

  public List<Movie> findByPublishedYear(Integer publishedYear) {
    return movieMapper.findByPublishedYear(publishedYear);
  }
}
