package com.example.demoinventory.service;

import com.example.demoinventory.model.Iterm;
import com.example.demoinventory.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    private List<Iterm>  items = new ArrayList<>();


    public ItemService() {
        items.add(new Iterm(1, "BOOK", "Book for kid"));
        items.add(new Iterm(2, "BOOK", "Book for student"));
    }

    public List<Iterm> getItems() {
        return items;
    }

}
