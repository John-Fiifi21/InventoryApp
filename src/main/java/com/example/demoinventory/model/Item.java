package com.example.demoinventory.model;

public class Item {
    private int id;
    private String name;
    private String description;
    private int quantity;

    public Item(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return name;
    }

    @Override
    public String toString() {
        return "Iterm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   public int getQuantity() {
        return quantity;
   }
  public void setQuantity(int quantity) {
        this.quantity = quantity;
  }
}
