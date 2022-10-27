package kodlama.io.rentACar.Entities.concretes;

public class Brand {
    private int id;
    private String isim;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Brand() {

    }
    public Brand(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }



}
