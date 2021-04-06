package com.example.Licenta.Model;

import lombok.Data;
import lombok.Value;

import javax.persistence.*;

@Entity //mapare a unei tabele
@Data //Setter, getter constr
@Table
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nume_hotel;
    int nr_stele;
    float long_h;
    float lat_h;
}
