package com.example.demoinventory.service;

import com.example.demoinventory.model.Item;
import com.example.demoinventory.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    private List<Item>  items = new ArrayList<>();


    public ItemService() {
        //items.add(new Item(1, "BOOK", "Book for kid"));
        //items.add(new Item(2, "BOOK", "Book for student"));
    }

    public List<Item> getItems() {
        return items;
    }

    public Item findItemById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void editItem(Item item) {
        // find book
        // edit
        //save
        items.set(items.indexOf(item), item);
    }

    public void deleteItem(int id) {
        // loop through the list and delete
    }

//    public Item searchItem(String name) {
//        return items.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
//    }

    public List<Item> searchItems(String query) {
        List<Item> results = new ArrayList<>();
        if(query != null ) {
            for (Item item : items) {
                if (item.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                        item.getDescription().toLowerCase().contains(query.toLowerCase())) {
                    results.add(item);
                }
            }
        }
        return results;
    }

}
