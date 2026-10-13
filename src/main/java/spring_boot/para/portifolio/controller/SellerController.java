package spring_boot.para.portifolio.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_boot.para.portifolio.dto.Sellers;
import spring_boot.para.portifolio.model.SellerModel;
import spring_boot.para.portifolio.repositories.SellersRepository;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    SellersRepository repository;

    @GetMapping("/list")
    public ResponseEntity getList(){
        List<SellerModel> list = repository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @PostMapping("/send")
    public ResponseEntity send(@RequestBody Sellers dto){

        var sellersSend = new SellerModel();
        BeanUtils.copyProperties(dto,sellersSend);

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(sellersSend));
    }

}
