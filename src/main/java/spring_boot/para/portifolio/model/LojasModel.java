package spring_boot.para.portifolio.model;

import jakarta.persistence.*;

@Entity(name = "lojas")
@Table(name = "lojas")
public class LojasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public LojasModel() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LojasModel(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}
