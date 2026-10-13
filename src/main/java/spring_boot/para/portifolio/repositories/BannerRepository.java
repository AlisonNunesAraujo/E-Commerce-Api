package spring_boot.para.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot.para.portifolio.model.BannerModel;

public interface BannerRepository extends JpaRepository<BannerModel,Integer> {
}
