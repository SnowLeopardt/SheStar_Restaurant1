package com.ugb.shestarrestaurant.models;

public class FeaturedModel {
    int image;
    String name;
    String des;

    public FeaturedModel(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.des = desc;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
