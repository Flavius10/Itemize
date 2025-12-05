package com.Itemize.Itemize.domain;

public interface Catalog {
    void addItem(Item item);
    void removeItem(Item item);
    Item getItemById(String id);
}
