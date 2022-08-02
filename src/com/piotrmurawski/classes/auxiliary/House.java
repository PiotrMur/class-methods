package com.piotrmurawski.classes.auxiliary;

public class House extends Building{

    private int size;
    private int familiesNumber;

    public House(String material, int wallsNumber, String shape, int size, int familiesNumber) {
        super(material, wallsNumber, shape);
        this.size = size;
        this.familiesNumber = familiesNumber;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFamiliesNumber() {
        return familiesNumber;
    }

    public void setFamiliesNumber(int familiesNumber) {
        this.familiesNumber = familiesNumber;
    }

    @Override
    public void paint() {
        super.paint();
    }
}
