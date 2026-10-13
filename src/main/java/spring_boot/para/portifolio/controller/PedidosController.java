package spring_boot.para.portifolio.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_boot.para.portifolio.dto.PedidosDto;
import spring_boot.para.portifolio.model.PedidosModel;
import spring_boot.para.portifolio.repositories.Pedidos;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    @Autowired
    Pedidos repository;

    @GetMapping("/list_pedidos")
    public ResponseEntity get(){
        List<PedidosModel> listPedidos = repository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(listPedidos);
    }

    @PostMapping("/list")
    public ResponseEntity send(@RequestBody PedidosDto dto){

        var pedidos = new PedidosModel();
        BeanUtils.copyProperties(dto, pedidos);

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(pedidos));

    }
}
