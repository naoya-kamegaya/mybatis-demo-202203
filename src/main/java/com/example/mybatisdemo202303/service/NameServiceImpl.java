package com.example.mybatisdemo202303;

import com.example.mybatisdemo202303.entity.Name;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameServiceImpl implements NameService {

  private final NameMapper nameMapper;

  public NameServiceImpl(NameMapper nameMapper) {
    this.nameMapper = nameMapper;
  }

  public List<Name> findAll(){
    return nameMapper.findAll();
  }
}
