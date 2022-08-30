package com.eshop.eshop.item;

/**
 * @author Jeremy Corbeilla <jeremy.corbeilla@fairfair.com>
 */
public class Item {
    private Long id;
    private String name;
    private float price;
    private String description;
    private Integer stock;


    public Item() {
    }

    public Item( Long id,
                 String name,
                 float price,
                 String description,
                 Integer stock ) {
        this.id          = id;
        this.name        = name;
        this.price       = price;
        this.description = description;
        this.stock       = stock;
    }


    public Item( String name, float price, String description, Integer stock ) {
        this.name        = name;
        this.price       = price;
        this.description = description;
        this.stock       = stock;
    }


    public Long getId() {
        return id;
    }


    public Item setId( Long id ) {
        this.id = id;

        return this;
    }


    public String getName() {
        return name;
    }


    public Item setName( String name ) {
        this.name = name;

        return this;
    }


    public float getPrice() {
        return price;
    }


    public Item setPrice( float price ) {
        this.price = price;

        return this;
    }


    public String getDescription() {
        return description;
    }


    public Item setDescription( String description ) {
        this.description = description;

        return this;
    }


    public Integer getStock() {
        return stock;
    }


    public Item setStock( Integer stock ) {
        this.stock = stock;

        return this;
    }

    @Override
    //je réecris la méthode toString afin qu'une fois que j'appelle Item.toString() la méthode me retourne l'objet Item sous type String
    public String toString(){
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price'" + price + '\'' +
                ", description'" + description + '\'' +
                ", stock'" + stock +
                '}';
    }
}
