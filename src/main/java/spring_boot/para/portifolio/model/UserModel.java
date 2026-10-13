package spring_boot.para.portifolio.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


@Table(name = "users")
@Entity
// UserDetails é o "formato" de usuário que o Spring Security entende
public class UserModel implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String usuario;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Construtor vazio: o Hibernate precisa dele para criar o objeto ao ler do banco
    public UserModel() {
    }

    public UserModel(Integer id, String password, String usuario) {
        this.id = id;
        this.password = password;
        this.usuario = usuario;
    }

    // ---- Métodos exigidos pelo UserDetails ----

    // Nome que o Spring usa no login (aqui, o campo "usuario")
    @Override
    public String getUsername() {
        return usuario;
    }

    // Permissões do usuário (roles). Lista vazia = sem permissões por enquanto
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    // Os 4 abaixo dizem se a conta está ativa. Retornando true, está tudo liberado
    @Override
    public boolean isAccountNonExpired() {
        return true; // conta não expirou
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // conta não está bloqueada
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // senha não expirou
    }

    @Override
    public boolean isEnabled() {
        return true; // conta habilitada
    }


}
