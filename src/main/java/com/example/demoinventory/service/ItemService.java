package com.example.demoinventory.service;

import com.example.demoinventory.model.Item;
import com.example.demoinventory.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    private List<Item>  items = new ArrayList<>();


    public ItemService() {
        //items.add(new Item(1, "BOOK", "Book for kid"));
        //items.add(new Item(2, "BOOK", "Book for student"));
    }

    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    public Item findItemById(int id) {
        return itemRepository.findById(id).orElse(null);
//        for (Item item : items) {
//            if (item.getId() == id) {
//                return item;
//            }
//        }
//        return null;
    }
    public void addItem(Item item) {
        itemRepository.save(item);
    }
    public void editItem(Item item) {
        // find book
        // edit
        //save
//        items.set(items.indexOf(item), item);
        itemRepository.save(item);

    }

    public void deleteItem(int id) {
        itemRepository.deleteById(id);
        // loop through the list and delete
    }

//    public Item searchItem(String name) {
//        return items.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
//    }

    public List<Item> searchItems(String query) {
        List<Item> results = new ArrayList<>();
        itemRepository.findAll().forEach(res -> {
            String name = res.getName();
            String description = res.getDescription();

            if ((name != null && name.toLowerCase().contains(query.toLowerCase())) ||
                    (description != null && description.toLowerCase().contains(query.toLowerCase()))) {
                results.add(res);
            }
        });
        return results;
    }


}
