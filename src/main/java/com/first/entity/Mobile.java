package com.first.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emei;
    private String brand;
    private String model;
    private double price;
    private int storage;
    private int ram;
    private int batteryCapacity;
    private String os;
    private int cameraResolution;
    private double screenSize;
    private boolean is5GEnabled;
    private String color;
    private double weight;

    public Mobile() {
    }

    public Mobile(int emei, String brand, String model, double price, int storage, int ram, int batteryCapacity, String os, int cameraResolution, double screenSize, boolean is5GEnabled, String color, double weight) {
        this.emei = emei;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
        this.ram = ram;
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.cameraResolution = cameraResolution;
        this.screenSize = screenSize;
        this.is5GEnabled = is5GEnabled;
        this.color = color;
        this.weight = weight;
    }

    public int getEmei() {
        return emei;
    }

    public void setEmei(int emei) {
        this.emei = emei;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isIs5GEnabled() {
        return is5GEnabled;
    }

    public void setIs5GEnabled(boolean is5GEnabled) {
        this.is5GEnabled = is5GEnabled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
