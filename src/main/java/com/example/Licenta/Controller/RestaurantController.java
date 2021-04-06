package com.example.Licenta.Controller;

import com.example.Licenta.DAO.RestaurantRepo;
import com.example.Licenta.Model.Restaurant;
import com.example.Licenta.Services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/restaurante")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;
    @Autowired
    RestaurantRepo restaurantRepo;
    @GetMapping
    public List<Restaurant> getAListener(){
        return restaurantRepo.findAll();
    }

    @PostMapping
    public void createRestaurant(@RequestBody Restaurant restaurant){
        restaurantRepo.save(restaurant);

    }
    @GetMapping("{id}")
    public Restaurant getRestaurantById(@PathVariable long id){
        return restaurantRepo.findById(id).get();
    }

    @PutMapping()
    public void updateRestaurant(@RequestBody Restaurant restaurant){

        restaurantRepo.save(restaurant);


    }

    @DeleteMapping("{id}")
    public void deleteRestaurant(@PathVariable long id){
        restaurantRepo.deleteById(id);
    }


}

