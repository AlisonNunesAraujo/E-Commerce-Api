package spring_boot.para.portifolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_boot.para.portifolio.dto.UserDto;
import spring_boot.para.portifolio.model.UserModel;
import spring_boot.para.portifolio.repositories.UserRepository;

@RestController
@RequestMapping("/login")
public class UserLoginController {

    @Autowired
    private AuthenticationManager manager;


    @PostMapping("/user")
    public ResponseEntity UserLogin(@RequestBody UserDto dto){

        var token = new UsernamePasswordAuthenticationToken(dto.user(), dto.password());
        var auth = manager.authenticate(token);

        return ResponseEntity.status(HttpStatus.OK).body("Ok");
    }

}
