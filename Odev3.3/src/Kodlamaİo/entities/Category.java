package Kodlamaİo.entities;

public class Category {

    private int id;
    private String categoryName;

    public Category() {
        System.out.println("katagori "+id+" çalıştı");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    public Category(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }


}
