/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author hp
 */
public abstract class Portal {
    private String cloth;
    private String toys;
    private String electronic;
    private double price;

    public Portal() {
    }

    public Portal(String cloth, String toys, String electronic, double price) {
        this.cloth = cloth;
        this.toys = toys;
        this.electronic = electronic;
        this.price = price;
    }

    public String getCloth() {
        return cloth;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public String getToys() {
        return toys;
    }

    public void setToys(String toys) {
        this.toys = toys;
    }

    public String getElectronic() {
        return electronic;
    }

    public void setElectronic(String electronic) {
        this.electronic = electronic;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
} 
