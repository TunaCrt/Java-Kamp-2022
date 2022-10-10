package oppWithNLayaredApp.entities;

public class Product {
    private int id;
    private String name;
    private double unıtPrice;

    public Product() {

    }

    public Product(int id, String name, double unıtPrice) {
        this.setId(id);
        this.setName(name);
        this.setUnıtPrice(unıtPrice);
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

    public double getUnıtPrice() {
        return unıtPrice;
    }

    public void setUnıtPrice(double unıtPrice) {
        this.unıtPrice = unıtPrice;
    }
}
