package com.example.MoreCrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name="chocolate_bar")
public class ChocolateBar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chocolate_bar_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "flavor")

    private String flavor;
    @Column(name = "brand")

    private String brand;

    public ChocolateBar() {
    }

    public ChocolateBar(String name, String flavor, String brand) {
        this.name = name;
        this.flavor = flavor;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "ChocolateBar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
