package spring_boot.para.portifolio.model;


import jakarta.persistence.*;

@Table(name = "pedidos")
@Entity(name = "pedidos")
public class PedidosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String modelo;

    public PedidosModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public PedidosModel(String name, String modelo) {
        this.name = name;
        this.modelo = modelo;
    }
}
