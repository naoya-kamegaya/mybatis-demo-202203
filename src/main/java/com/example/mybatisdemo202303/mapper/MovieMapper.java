package com.example.mybatisdemo202303.mapper;

import com.example.mybatisdemo202303.entity.Movie;
import com.example.mybatisdemo202303.entity.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MovieMapper {
  @Select("SELECT * FROM movies")
  List<Movie> findAll();

  @Select("SELECT * FROM movies WHERE published_year = #{publishedYear}")
  List<Movie> findPublishedYear(String publishedYear);
}
