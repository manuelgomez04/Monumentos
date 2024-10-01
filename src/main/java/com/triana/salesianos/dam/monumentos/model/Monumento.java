package com.triana.salesianos.dam.monumentos.model;


import jakarta.persistence.*;
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
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 2) //Creamos el código de país de tal manera que solo tenga dos caracteres
    private String codigopaís;

    @Column(nullable = false)
    private String nombre, nombreCiudad, nombreMonumento, descripcion, urlFoto;

    private  double latitud, altitud;





}