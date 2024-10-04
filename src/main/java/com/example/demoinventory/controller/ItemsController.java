package com.example.demoinventory.controller;

import com.example.demoinventory.model.Item;
import com.example.demoinventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        return  itemService.findItemById(id);
    }

    @PostMapping
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @PutMapping("/{id}")
    public void editItem(@PathVariable int id, @RequestBody Item item) {
        itemService.editItem(item);
    }


//    @GetMapping("/search")
//    public List<Item> searchItems(@RequestParam String query) {
//        return itemService.searchItems(query);
//    }

//    @GetMapping("/search")
//        public List<Item> searchItem(@RequestParam(name = "search", required = false) String search) {
//            if(search != null) {
//                return  itemService.searchItem(search);
//            }
//        }
//
    @GetMapping("search")
    public List<Item> searchItems(@RequestParam(name = "filter", required = false) String item) {
        return itemService.searchItems(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id) {
        itemService.deleteItem(id);
    }
}


