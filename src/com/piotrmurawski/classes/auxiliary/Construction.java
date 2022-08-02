package com.piotrmurawski.classes.auxiliary;

public class Construction {

    private String material;
    private boolean painted = true;

    public Construction(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isPainted() {
        return painted;
    }

    @Override
    public String toString() {
        return "Construction: " + material;
    }



    public void paint() {
        Class c = getClass();
        if(!this.painted){
            System.out.println(c.getSimpleName() + " not painted.");
            this.painted = true;
            System.out.println("Painting... Done!");
        } else {
            System.out.println(c.getSimpleName() + " is already painted");
        }
    }
}
