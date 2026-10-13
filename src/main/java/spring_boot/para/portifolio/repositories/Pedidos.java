package spring_boot.para.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot.para.portifolio.model.PedidosModel;

public interface Pedidos extends JpaRepository<PedidosModel,String> {
}
