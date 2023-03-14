package com.example.mybatisdemo202303.service;

import com.example.mybatisdemo202303.entity.Movie;

import java.util.List;

public interface MovieService {
  List<Movie> findByPublishedYear(Integer publishedYear);
}
