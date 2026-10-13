package spring_boot.para.portifolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_boot.para.portifolio.model.CartModel;
import spring_boot.para.portifolio.repositories.CartRepository;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartRepository repository;

    @GetMapping("/list")
    public ResponseEntity getCart(){
        List<CartModel> listCart = repository.findAll();

       return ResponseEntity.status(HttpStatus.OK).body(listCart);
    }

}
