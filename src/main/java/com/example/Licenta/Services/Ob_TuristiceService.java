package com.example.Licenta.Services;

import com.example.Licenta.DAO.Ob_TuristiceRepo;
import com.example.Licenta.Model.Ob_Turistice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ob_TuristiceService {
    @Autowired
    Ob_TuristiceRepo ob_turisticeRepo;


    public Ob_Turistice findById(long id_obtur)  {
        Ob_Turistice ob_turistice = ob_turisticeRepo.findById(id_obtur).get();
//        if(ob_turistice == null)
//            throw new RuntimeException("aia e");
        return ob_turistice;
    }
}