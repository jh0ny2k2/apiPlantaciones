package com.jaroso.plantaciones.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlantacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlantacion;
    private String nombre;
    private String ubicacion;
    private String tipoCultivo;

    @OneToMany(mappedBy = "plantacion")
    private List<SensorEntity> sensores;


}
