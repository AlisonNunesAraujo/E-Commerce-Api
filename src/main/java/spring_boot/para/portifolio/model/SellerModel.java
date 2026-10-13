package spring_boot.para.portifolio.model;

import jakarta.persistence.*;

@Table(name = "sellers")
@Entity(name = "sellers")
public class SellerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public SellerModel() {

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

    public SellerModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
