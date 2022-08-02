package com.piotrmurawski.classes.auxiliary;

import java.util.Objects;

public class Car {

    private String manufacturer;
    private String brand;
    private int numberOfDoors;
    private String typeOfEngine;

    public Car(String manufacturer, String brand, int numberOfDoors, String typeOfEngine) {
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
        this.typeOfEngine = typeOfEngine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String toString(){
        Class car = getClass();
        return "getName(): " + car.getName() + "\n"+
                "getSimpleName(): " + car.getSimpleName() + "\n"+
                "getCanonicalName(): " + car.getCanonicalName() + "\n"+
                "getPackageName(): " + car.getPackageName() + "\n"+
                "getTypeName(): " + car.getTypeName() + "\n";

    }



    /*@Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Car)){
            return false;
        }
        Car c = (Car) o;
        return manufacturer.equals(c.manufacturer)
                && brand.equals(c.brand)
                && numberOfDoors == c.numberOfDoors
                && typeOfEngine.equals(c.typeOfEngine);
    }*/

    /*@Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Car)){
            return false;
        }

        Car c = (Car) o;

        if()
    }*/



    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + numberOfDoors;
        result = 31 * result + (typeOfEngine != null ? typeOfEngine.hashCode() : 0);
        return result;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (numberOfDoors != car.numberOfDoors) return false;
        if (manufacturer != null ? !manufacturer.equals(car.manufacturer) : car.manufacturer != null) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        return typeOfEngine != null ? typeOfEngine.equals(car.typeOfEngine) : car.typeOfEngine == null;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors
                && Objects.equals(manufacturer, car.manufacturer)
                && Objects.equals(brand, car.brand)
                && Objects.equals(typeOfEngine, car.typeOfEngine);
    }
}
