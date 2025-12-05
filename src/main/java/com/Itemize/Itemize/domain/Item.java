package com.Itemize.Itemize.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {

    private Long id;
    private String name;
    private BigDecimal price;

    public Item(Long id, String name, BigDecimal price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return this.name;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("Item{id=%d, name='%s', price=%s}", id, name, price.toString());
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;

        if (obj == null) return false;

        if (! (obj instanceof Item))
            return false;

        Item item = (Item) obj;
        return this.id.equals(item.getId());
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

}
