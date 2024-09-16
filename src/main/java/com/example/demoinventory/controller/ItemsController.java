package com.example.demoinventory.controller;

import com.example.demoinventory.model.Iterm;
import com.example.demoinventory.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ItemsController {
  private ItemService itemService;
  public ItemsController(ItemService itemService) {
      this.itemService = itemService;
  }

  @GetMapping
    List<Iterm> getAllItems() {
      return itemService.getItems();
  }
}
