package com.example.mybatisdemo202303.controller;

import com.example.mybatisdemo202303.entity.Name;

public class NameResponse {
  private String name;

  public NameResponse(Name name) {
    this.name = name.getName();
  }

  public String getName() {
    return name;
  }
}
