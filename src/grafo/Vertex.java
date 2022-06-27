package grafo;

import java.util.Objects;

public class Vertex {
    private int id;
    private String name;
    private String description;

    public Vertex(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        if (Objects.equals(String.valueOf(id), "")) {
            System.out.println("ID vazio não será adicionado");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (Objects.equals(name, "")) {
            System.out.println("Nome vazio não será adicionado");
        }
        this.name = name;
    }

    public void setDescription(String description) {
        if (Objects.equals(description, "")) {
            System.out.println("Descrição vazia não será adicionada");
        }
        this.description = description;
    }

    public Vertex(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Quest{\n\tID= " + "'" + id + "'" +
                "\n\tName= " + "'" + name + "'" +
                "\n\tDescription= " + "'" + description + "'" +
                "\n}\n";
    }
}
