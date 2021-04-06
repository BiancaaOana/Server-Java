package com.example.Licenta.Controller;

import com.example.Licenta.DAO.Ob_TuristiceRepo;
import com.example.Licenta.Model.Ob_Turistice;
import com.example.Licenta.Services.Ob_TuristiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/obtur")
public class Ob_TuristiceController {

    @Autowired
    Ob_TuristiceService ob_turisticeService;
    @Autowired
    Ob_TuristiceRepo ob_turisticeRepo;
    @GetMapping
    public List<Ob_Turistice> getListener(){
        return ob_turisticeRepo.findAll();
    }

    @PostMapping
    public void createOb_Turistice(@RequestBody Ob_Turistice ob_turistice){
        ob_turisticeRepo.save(ob_turistice);

    }
    @GetMapping("{id_obtur}")
    public Ob_Turistice getOb_TuristiceById(@PathVariable("id_obtur") long id_obtur){
        return ob_turisticeRepo.findById(id_obtur).get();
    }

    @PutMapping()
    public void updateOb_Turistice(@RequestBody Ob_Turistice ob_turistice){

        ob_turisticeRepo.save(ob_turistice);


    }

    @DeleteMapping("{id_obtur}")
    public void deleteOb_Turistice(@PathVariable("id_obtur") long id_obtur){
        ob_turisticeRepo.deleteById(id_obtur);
    }


}