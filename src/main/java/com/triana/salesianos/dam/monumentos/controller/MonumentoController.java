package com.triana.salesianos.dam.monumentos.controller;


import com.triana.salesianos.dam.monumentos.model.Monumento;
import com.triana.salesianos.dam.monumentos.services.MonumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/monumentos")
@RequiredArgsConstructor
public class MonumentoController {

    @Autowired
    private MonumentoService monumentoService;

    @GetMapping("/all")
    public ResponseEntity<List<Monumento>> mostrarTodos(){
        return new ResponseEntity<>(monumentoService.obtenerTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monumento>mostrarMonumento(@PathVariable Long id){
        return ResponseEntity.ok(monumentoService.obtenerPorId(id));
    }

    @PostMapping("/add")
    public ResponseEntity<Monumento> addMonumento(@RequestBody Monumento m){
        Monumento nuevoMonumento = monumentoService.addMonumento(m);
        return ResponseEntity.status(HttpStatus.CREATED).body(monumentoService.addMonumento(nuevoMonumento));
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Monumento> editMonumento(@PathVariable Long id, @RequestBody Monumento m){
        return ResponseEntity.ok(monumentoService.modificarMonumento(id, m));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMonumento(@PathVariable Long id){
        monumentoService.deleteByiD(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
