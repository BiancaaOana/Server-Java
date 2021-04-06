package com.example.Licenta.Services;

import com.example.Licenta.DAO.RestaurantRepo;
import com.example.Licenta.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepoRepo;


    public Restaurant findById(long id)  {
        Restaurant restaurant = restaurantRepoRepo.findById(id).get();
//        if(restaurant == null)
//            throw new RuntimeException("aia e");
        return restaurant;
    }
}