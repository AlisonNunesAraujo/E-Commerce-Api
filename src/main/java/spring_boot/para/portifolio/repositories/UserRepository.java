package spring_boot.para.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import spring_boot.para.portifolio.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer> {
    UserDetails findByUsuario(String username);
}
