package com.northcoders.fruityviceapp.model;

public class Fruit {

    private String name;
    private int id;
    private String family;
    private String order;
    private String genus;
    private Nutritions nutritions;

    public Fruit(String name, int id, String family, String order, String genus, Nutritions nutritions) {
        this.name = name;
        this.id = id;
        this.family = family;
        this.order = order;
        this.genus = genus;
        this.nutritions = nutritions;
    }

    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getFamily() {
        return family;
    }

    public String getOrder() {
        return order;
    }

    public String getGenus() {
        return genus;
    }

    public Nutritions getNutritions() {
        return nutritions;
    }
}
