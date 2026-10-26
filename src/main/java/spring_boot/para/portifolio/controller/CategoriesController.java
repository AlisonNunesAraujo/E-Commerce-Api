package spring_boot.para.portifolio.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_boot.para.portifolio.dto.CategoriesDto;
import spring_boot.para.portifolio.model.CategoriesModel;
import spring_boot.para.portifolio.repositories.Categories;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class CategoriesController {

    @Autowired
    Categories repository;

    @GetMapping("/list_categories")
    public ResponseEntity getCategories(){
        List<CategoriesModel> listCategories = repository.findAll();

        return  ResponseEntity.status(HttpStatus.OK).body(listCategories);

    }

    @PostMapping("/send_cat")
    public ResponseEntity send(@RequestBody CategoriesDto dto){

        var categories = new CategoriesModel();
        BeanUtils.copyProperties(dto,categories);

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(categories));

    }

    @DeleteMapping("/categories/{id}")
    public ResponseEntity getId(@PathVariable(value = "id") String id){

        Optional <CategoriesModel>categories = repository.findById(id);

        repository.delete(categories.get());

        return  ResponseEntity.status(HttpStatus.OK).body("ok");

    }



}
