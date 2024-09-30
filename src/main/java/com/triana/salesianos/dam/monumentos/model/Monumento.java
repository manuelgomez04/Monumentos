package com.triana.salesianos.dam.monumentos.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Monumento {

    @Id
    @GeneratedValue
    private long id;

    private String nombre, nombreCiudad, nombreMonumento, descripcion, urlFoto, codigoIso;

    private  double latitud, altitud;





}