package com.jaroso.plantaciones.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SensorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSensor;
    private String nombre;
    private String ubicacion;
    private LocalDate fechaInstalacion;

    @ManyToOne
    @JoinColumn(name = "idPlantacion")
    private PlantacionEntity plantacion;

    @OneToMany(mappedBy = "sensor")
    private List<RegistroEntity> registros;



}
