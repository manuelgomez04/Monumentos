package com.triana.salesianos.dam.monumentos.services;

import com.triana.salesianos.dam.monumentos.model.Monumento;
import com.triana.salesianos.dam.monumentos.repository.MonumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonumentoService {


    @Autowired
    private MonumentoRepository monumentoRepository;


    public List<Monumento> obtenerTodos() {

        return monumentoRepository.findAll();
    }

    public Monumento obtenerPorId(Long id) {
        return monumentoRepository.findById(id).orElse(null);
    }



    public Monumento modificarMonumento(Long id, Monumento monumento) {
        Monumento monumentoEncontrado = monumentoRepository.findById(id).orElse(null);

        if(monumentoEncontrado!=null){
            return monumentoRepository.save(monumento);
        } else
            return monumento;
    }

    public void deleteByiD(Long id) {
        monumentoRepository.deleteById(id);

    }

    public Monumento addMonumento (Monumento monumento){
        return monumentoRepository.save(monumento);
    }
}
