package com.example.Licenta.Model;

import lombok.Data;

import javax.persistence.*;

@Entity //mapare a unei tabele
@Data //Setter, getter constr
@Table
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String denumire_restaurant;
    String specific_restaurant;
    int rating_restaurant;
    float long_r;
    float lat_r;
}
