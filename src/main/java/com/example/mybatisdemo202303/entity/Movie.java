package com.example.mybatisdemo202303.entity;

public class Movie {
  private int id;
  private String name;
  private int publishedYear;

  public Movie(int id, String name, Integer publishedYear) {
    this.id = id;
    this.name = name;
    this.publishedYear = publishedYear;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getPublishedYear() {
    return publishedYear;
  }

}
