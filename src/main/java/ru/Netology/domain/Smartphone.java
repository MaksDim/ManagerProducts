package ru.Netology.domain;

import ru.Netology.domain.Product;

public class Smartphone extends Product {
    private String SmartphoneName;
    private String Manufacturer;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String SmartphoneName, String Manufacturer){
        super(id, name, price);
        this.SmartphoneName = SmartphoneName;
        this.Manufacturer = Manufacturer;
    }

    public String getSmartphoneName() {
        return SmartphoneName;
    }

    public void setSmartphoneName(String smartphoneName) {
        SmartphoneName = smartphoneName;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }
}
