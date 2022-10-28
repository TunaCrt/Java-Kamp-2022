package Kodlama.io.Kodlama.io.Devs.entities;

public class ProgrammingLanguage {
    private int id;
    private String name;

    public ProgrammingLanguage(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProgrammingLanguage() {
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




}
