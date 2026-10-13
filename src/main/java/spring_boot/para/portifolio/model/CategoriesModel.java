package spring_boot.para.portifolio.model;


import jakarta.persistence.*;

@Table(name = "categories")
@Entity(name = "categories")
public class CategoriesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public CategoriesModel() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoriesModel(String name) {
        this.name = name;
    }
}
