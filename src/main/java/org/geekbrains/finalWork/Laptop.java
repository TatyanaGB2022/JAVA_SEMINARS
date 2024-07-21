package org.geekbrains.finalWork;

class Laptop {
    private String model;
    private int ram;
    private int hddCapacity;
    private String os;
    private String color;
    private double price;

    public Laptop(String model, int ram, int hddCapacity, String os, String color, double price) {
        this.model = model;
        this.ram = ram;
        this.hddCapacity = hddCapacity;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    // Геттеры
    public int getRam() { return ram; }
    public int getHddCapacity() { return hddCapacity; }
    public String getOs() { return os; }
    public String getColor() { return color; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", hddCapacity=" + hddCapacity +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

