package com.ugb.shestarrestaurant.models;

public class DailyMealModel {

    int image;
    String name;
    String descuentos;
    String description;
    String type;

    public  DailyMealModel(int image, String name, String descuentos, String description, String type) {
        this.image = image;
        this.name = name;
        this.descuentos = descuentos;
        this.description = description;
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(String descuentos) {
        this.descuentos = descuentos;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



