package spring_boot.para.portifolio.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_boot.para.portifolio.dto.LojaDto;
import spring_boot.para.portifolio.model.LojasModel;
import spring_boot.para.portifolio.repositories.LojasRepository;

import java.util.List;

@RestController
@RequestMapping("/Lojas")
public class LojasController {


    @Autowired
    LojasRepository repository;

    @GetMapping("/list_lojas")
    public ResponseEntity get(){

        List<LojasModel> listLojas = repository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(listLojas);

    }

    @PostMapping("/send")
    public ResponseEntity send(@RequestBody LojaDto dto){

        var lojasName = new LojasModel();

        BeanUtils.copyProperties(dto, lojasName);

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(lojasName));
    }

}
