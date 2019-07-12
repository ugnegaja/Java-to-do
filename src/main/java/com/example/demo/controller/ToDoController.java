package com.example.demo.controller;

import com.example.demo.model.IToDoRepository;
import com.example.demo.model.dto.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class ToDoController {
    @Autowired
    IToDoRepository mainService;

    @GetMapping("/view")
    public Iterable<ItemDTO> getAll() {
        return mainService.findAll();
    }

    @PostMapping("/add")
    public void addItem(@RequestBody ItemDTO Item) {
        mainService.save(Item);
    }

    @PutMapping("/edit")
    public void eitItem(@RequestBody ItemDTO Item) {
        mainService.save(Item);
    }

    @DeleteMapping("/delete")
    public void deleteItem(@RequestParam Integer id) {
        mainService.deleteById(id);
    }

}
