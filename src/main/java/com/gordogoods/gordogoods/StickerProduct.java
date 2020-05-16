package com.gordogoods.gordogoods;

import org.springframework.core.io.InputStreamResource;

public class StickerProduct {

    private int id;
    private String description;
    private double price;
    private InputStreamResource image;

    public StickerProduct(int id, String description, double price, InputStreamResource image) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.image = image;
    }
    public StickerProduct(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;

    }

    public InputStreamResource getImage() {
        return image;
    }

    public void setImage(InputStreamResource image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
