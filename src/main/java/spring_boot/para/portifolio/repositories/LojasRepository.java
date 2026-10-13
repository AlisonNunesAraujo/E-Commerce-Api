package spring_boot.para.portifolio.repositories;

import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot.para.portifolio.model.LojasModel;

public interface LojasRepository extends JpaRepository<LojasModel, Integer> {


}
