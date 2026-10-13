package spring_boot.para.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot.para.portifolio.model.CartModel;

public interface CartRepository extends JpaRepository<CartModel,Integer>{
}
