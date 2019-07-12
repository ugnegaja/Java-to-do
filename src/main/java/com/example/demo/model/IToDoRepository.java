package com.example.demo.model;

import com.example.demo.model.dto.ItemDTO;
import org.springframework.data.repository.CrudRepository;

public interface IToDoRepository extends CrudRepository<ItemDTO, Integer> {
}
