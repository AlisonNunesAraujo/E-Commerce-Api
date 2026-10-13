package spring_boot.para.portifolio.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_boot.para.portifolio.dto.BannerdDto;
import spring_boot.para.portifolio.model.BannerModel;
import spring_boot.para.portifolio.repositories.BannerRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/banners")
public class BannerController {
    @Autowired
    BannerRepository repository;

    @GetMapping("list")
    public ResponseEntity getSend(){
        List<BannerModel> listBanner = repository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(listBanner);
    }

    @PostMapping("/send")
    public ResponseEntity send(@RequestBody BannerdDto dto){

        var bannersSend = new BannerModel();
        BeanUtils.copyProperties(dto,bannersSend);


        return ResponseEntity.status(HttpStatus.OK).body(repository.save(bannersSend));


    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBanner(@PathVariable(value = "id") Integer id ){
        Optional <BannerModel> banner = repository.findById(id);

        repository.delete(banner.get());


        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable(value = "id") Integer id,@RequestBody BannerdDto dto){

        Optional <BannerModel> banner = repository.findById(id);

        var update = banner.get();

        BeanUtils.copyProperties(dto,update);

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(update));
    }

}
