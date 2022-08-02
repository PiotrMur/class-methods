package com.piotrmurawski.classes.auxiliary;

public class Building extends Construction{

    private int wallsNumber;
    private String shape;
    private boolean painted = true;

    public Building(String material, int wallsNumber, String shape) {
        super(material);
        this.wallsNumber = wallsNumber;
        this.shape = shape;
    }

    public int getWallsNumber() {
        return wallsNumber;
    }

    public void setWallsNumber(int wallsNumber) {
        this.wallsNumber = wallsNumber;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }


}
