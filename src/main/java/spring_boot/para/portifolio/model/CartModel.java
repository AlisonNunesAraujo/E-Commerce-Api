package spring_boot.para.portifolio.model;

import jakarta.persistence.*;

@Table(name = "cart")
@Entity(name = "cart")
public class CartModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private Long price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public CartModel(int id, Long price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
}

