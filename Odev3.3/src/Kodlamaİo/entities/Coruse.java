package Kodlamaİo.entities;

public class Coruse {
    private int id;
    private String coruseName;
    private double unıtPrice;

    public Coruse(int id, String coruseName, double unıtPrice) {
        this.id = id;
        this.coruseName = coruseName;
        this.unıtPrice = unıtPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoruseName() {
        return coruseName;
    }

    public void setCoruseName(String coruseName) {
        this.coruseName = coruseName;
    }

    public double getUnıtPrice() {
        return unıtPrice;
    }

    public void setUnıtPrice(double unıtPrice) {
        this.unıtPrice = unıtPrice;
    }






}
