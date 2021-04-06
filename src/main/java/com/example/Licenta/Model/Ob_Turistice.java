package com.example.Licenta.Model;

import lombok.Data;

import javax.persistence.*;

@Entity //mapare a unei tabele
@Data //Setter, getter constr
@Table
public class Ob_Turistice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id_obtur;
    String denumire_obtur;
    String informatii_obtur;
    float long_o;
    float lat_o;
}