package spring_boot.para.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot.para.portifolio.model.SellerModel;

public interface SellersRepository extends JpaRepository<SellerModel,String> {
}
