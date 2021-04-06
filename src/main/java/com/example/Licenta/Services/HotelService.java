package com.example.Licenta.Services;

import com.example.Licenta.DAO.HotelRepo;
import com.example.Licenta.Model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    @Autowired
    HotelRepo hotelRepo;


    public Hotel findById(long id_hotel)  {
        Hotel hotel = hotelRepo.findById(id_hotel).get();
//        if(hotel == null)
//            throw new RuntimeException("aia e");
        return hotel;
    }
}