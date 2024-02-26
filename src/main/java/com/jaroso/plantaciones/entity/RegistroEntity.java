package com.jaroso.plantaciones.entity;

import com.jaroso.plantaciones.repository.PlantacionRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistro;
    private LocalDate fecha;
    private Double temperatura;
    private Double humedad;

    @ManyToOne
    @JoinColumn(name = "idSensor")
    private SensorEntity sensor;

    @ManyToOne
    @JoinColumn(name = "idPlantacion")
    private PlantacionEntity plantacion;

}




