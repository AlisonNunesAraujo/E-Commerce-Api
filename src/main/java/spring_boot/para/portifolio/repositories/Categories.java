package spring_boot.para.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;
import spring_boot.para.portifolio.model.CategoriesModel;

public interface Categories extends JpaRepository<CategoriesModel, String> {
}
