package com.Itemize.Itemize.domain;

import java.util.List;

public interface Catalog {
    void addItem(Item item);
    void removeItem(Item item);
    Item getItemById(String id);

    List<Item> getAllItems();
}
