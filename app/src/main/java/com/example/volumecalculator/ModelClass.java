package com.example.volumecalculator;

public class ModelClass {
    int Image;
    String ShapeName;

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getShapeName() {
        return ShapeName;
    }

    public void setShapeName(String shapeName) {
        ShapeName = shapeName;
    }

    public ModelClass(int image, String shapeName) {
        Image = image;
        ShapeName = shapeName;
    }
}
