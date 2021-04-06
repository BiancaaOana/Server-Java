package com.example.Licenta.Controller;

import com.example.Licenta.DAO.HotelRepo;
import com.example.Licenta.Model.Hotel;
import com.example.Licenta.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "/hoteluri")
public class HotelController {

    @Autowired
    HotelService hotelService;
    @Autowired
    HotelRepo hotelRepo;
    @GetMapping
    public List<Hotel> getListener(){
        return hotelRepo.findAll();
    }

    @PostMapping
    public void createHotel(@RequestBody Hotel hotel){
        hotelRepo.save(hotel);
        System.out.println(hotel);

    }
    @GetMapping("{id}")
    public Hotel getHotelById(@PathVariable long id){
        System.out.println(id);
        return hotelRepo.findById(id).get();
    }

    @PutMapping("/put/")
    public void updateHotel(@RequestBody Hotel hotel){

        hotelRepo.save(hotel);


    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public void deleteHotel(@PathVariable("id") long id){
        hotelRepo.deleteById(id);
    }


}
